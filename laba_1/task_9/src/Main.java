import basketball.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball(Color.RED, 2.1));
        balls.add(new Ball(Color.YELLOW, 0.4));
        balls.add(new Ball(Color.BLUE, 1.13));
        balls.add(new Ball(Color.BLUE, 1.75));
        balls.add(new Ball(Color.RED, 1.5));
        balls.add(new Ball(Color.BLACK, 0.13));
        balls.add(new Ball(Color.BLUE, 0.77));

        Basket basket = new Basket(balls);
        System.out.println("Total weight = " + basket.totalWeight + "\n" +
                "Blue balls count = " + basket.getCountByColor(Color.blue));
    }
}