package MembrosEstaticos;

import MembrosEstaticos.Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExemplodaAulaUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radious = sc.nextDouble();

        double c = Calculator.circunference(radious);
        double v = Calculator.volume(radious);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
