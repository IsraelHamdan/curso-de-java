package Tipos;

public class Casting {
    public static void main(String[] args) {
        // No Java temos uma coisa chamada casting que é serve para converter variáveis ;

        // no caso do float, precisamos colocar um 'f' minusculo depois do numero que desejamos assegurar como string
        float salarioFloat = 2500.90f;
        System.out.println(salarioFloat);

        // se quisermos assegurar que uma variável é do tipo double, temos que colocar um 'D' depois do numero
        double salarioDouble = (float) 2500.900D;
        System.out.println(salarioDouble);

        /* desse modo, nós estamos forçando uma variável que é do tipo long caber dentro da variável inteira, isso é o
         casting */
        int litros = (int)10000000000L;
        System.out.println(litros);

    }

}
