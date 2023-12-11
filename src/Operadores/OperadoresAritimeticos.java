package Operadores;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        //Nós temos operadores basicos no java: Soma (+), Subtração(-), multiplicação(*),  Divisão (/)
        int n1 = 10;
        int n2 = 20;
        int soma = n1 + n2;
        System.out.println("soma: "+soma);

        int multi = n1*n2;
        System.out.println("multiplicação: "+multi);

        int sub = n1-n2;
        System.out.println("subtração: "+sub);

        float div = (float) n1 /n2;
        System.out.println("divisão: "+div);

        /* No java temos a seguinte questão: Quando colocamos o simbolo de adição, dependendo da posição o Java entende as coisas diferente
        * No caso, se vc usa ele antes de uma string, ele vai entender que aquilo se trata de uma soma, por exemplo: n1 + n2 + "string"+ n1 + n2
        * Ai nesse caso o java vai entender que se trata de uma soma, e depois de uma concatenação, a saida disso seria: 30 string 2010*/


    }
}
