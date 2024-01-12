package Application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Funcionario empregado = new Funcionario();

        System.out.println("Insira o nome do empregado: ");
        empregado.nome = sc.next();

        System.out.println("\nInsira o salario do empregado: ");
        empregado.salarioBruto =  sc.nextDouble();

        System.out.println("\nInsira o desconto do salario: ");
        empregado.tax = sc.nextDouble();

        System.out.println("\nInsira a porcentagem de aumento do salario do empregado: ");
        double porcentagem = sc.nextDouble();
        empregado.IncreasedSalary(porcentagem);

        System.out.println("\n Empregado: " + empregado);

        sc.close();
    }
}
