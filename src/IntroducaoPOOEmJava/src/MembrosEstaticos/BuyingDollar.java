package MembrosEstaticos;


import MembrosEstaticos.Util.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class BuyingDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira o valor do dollar: ");
        Dollar.dollarValue = sc.nextDouble();

        System.out.println("\nQuantos dolares você deseja comprar?");
        double dollar = sc.nextDouble();

        System.out.println("Você gastará: " + dollar + ", por: " + Dollar.precoEmReais(dollar) + "\nSerá cobrado um valor de 6% do valor do dollar em IOF");

        sc.close();
    }

}
