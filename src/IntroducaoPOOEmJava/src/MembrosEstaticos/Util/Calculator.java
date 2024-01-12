package MembrosEstaticos.Util;

public class Calculator {
    public static final double PI = 3.14159;
    public static double circunference(double radious) {
        return 2.0 * PI * radious;
    }

    public static double volume(double radious) {
        return 4.0 * PI * (radious*radious*radious) / 3.0;
    }
}
