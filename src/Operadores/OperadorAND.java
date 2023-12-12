package Operadores;

public class OperadorAND {
    public static void main(String[] args) {
        // Além dos outros operadores que vimos antes temos o operador lógico AND(&&)
        // O AND só retonrará true, somente se as duas condições forem verdadeiras
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQue30: " + isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30: " + isDentroDaLeiMenorQue30);

    }
}
