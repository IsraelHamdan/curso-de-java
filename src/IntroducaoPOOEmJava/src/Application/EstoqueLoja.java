package Application;

import entities.EstoqueProduto;

import java.util.Locale;
import java.util.Scanner;


public class EstoqueLoja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EstoqueProduto produto = new EstoqueProduto();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        produto.name = sc.nextLine();

        System.out.print("Quantity: ");
        produto.quantity = sc.nextInt();

        System.out.print("Price: ");
        produto.price = sc.nextDouble();

        System.out.println("\nProduct data: "+produto);

        System.out.println("\nInsira a quantidade de produtos que vc deseja inserir: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println("Updated data: "+produto);

        System.out.println("\nInsira a quantidade de produtos que vc quer remover:");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println("Updated data: "+produto);


        sc.close();
    }
}
