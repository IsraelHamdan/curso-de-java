package Operadores;

public class OperadorOR {
    // Para o OR usamos o simbolo de (||)
    // Essa condição só retornará true se uma condição ou outra for verdadeira
    public static void main(String[] args) {
       double valorContaCorrente = 200;
       double valorContaPoupaca = 100000;
       float valorDeCompra = 5000;

       boolean isPossivelCoprar = valorContaCorrente > valorDeCompra || valorContaPoupaca > valorDeCompra;
       System.out.println(isPossivelCoprar);

    }
}
