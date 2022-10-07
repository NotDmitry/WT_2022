import figures.*;
import figures.Point;

public class Main {
    public static void main(String[] args) {
        RectArea lowerRect = new RectArea(-6, 0, 12, 3);
        RectArea upperRect = new RectArea(-4, 5, 8, 5);
        var testPoints = new Point[3];
        testPoints[0] = new Point(0, 0);
        testPoints[1] = new Point(10, 10);
        testPoints[2] = new Point(-4, 0);
        for (var point:testPoints) {
            if (upperRect.isPointInRect(point.x, point.y) ||
                    lowerRect.isPointInRect(point.x, point.y))
                System.out.println("Point (" + point.x + ", " + point.y + ") belongs to filled area");
            else
                System.out.println("Point (" + point.x + ", " + point.y + ") doesn't belong to filled area");
        }
    }
}