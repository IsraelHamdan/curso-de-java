package MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExemploDaAulaUm {
    // declarando uma constante para o valor de PI
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio: ");
        double radious = sc.nextDouble();

        double c = circunference(radious);
        double v = volume(radious);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);


        sc.close();
    }
    public static double circunference(double radious) {
        return 2.0 * PI * radious;
    }

    public static double volume(double radious) {
        return 4.0 * PI * (radious*radious*radious) / 3.0;
    }

}
