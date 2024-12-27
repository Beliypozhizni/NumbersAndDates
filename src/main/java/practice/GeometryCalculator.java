package practice;

public class GeometryCalculator {

    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return 4.0 / 3 * Math.PI * Math.pow(Math.abs(radius), 3);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return -1.0;
        }
    }
}
