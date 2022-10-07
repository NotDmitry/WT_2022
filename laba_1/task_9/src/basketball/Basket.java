package basketball;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;
    public double totalWeight;

    public Basket()
    {
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls)
    {
        if (balls == null)
            throw new NullPointerException();

        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            addBall(ball);
    }

    public void addBall(Ball ball)
    {
        if (ball == null)
            throw new NullPointerException();

        this.balls.add(ball);
        this.totalWeight += ball.weight;
    }

    public void remove(Ball ball){
        balls.remove(ball);
        this.totalWeight -= ball.weight;
    }

    public int getCountByColor(Color color)
    {
        int total = 0;
        for (var  ball: balls)
        {
            if (ball.color == color)
                total++;
        }
        return total;
    }
}
