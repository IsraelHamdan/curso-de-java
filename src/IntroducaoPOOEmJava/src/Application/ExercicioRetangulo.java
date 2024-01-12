package Application;

import entities.Retangulo;


import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo =  new Retangulo();

        System.out.println("Insira os lados do triangulo: ");

        System.out.println("\n lado A: ");
        retangulo.a = sc.nextDouble();

        System.out.println("\nlado B:");
        retangulo.b = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();
    }
}
