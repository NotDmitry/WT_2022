package formula;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double x = 24.5;
        double y = 190.587;
        System.out.printf(
                "\n x = %f\n y = %f\n"+
        """
                
                    1 + sin^2(x + y)
               -------------------------  + x   =   %.3f
                    |         2x      |
                2 + | x -  ---------  |
                    |      1 + (xy)^2 |
                
        """
                , x, y, calculateFormula(x, y));
    }

    static double calculateFormula(double x, double y){
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs( x - 2*x / (1 + x*x * y*y));
        return numerator / denominator + x;
    }
}