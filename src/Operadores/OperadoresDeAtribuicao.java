package Operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // O primeiro deles é o igual(=), significa que determinada variável ou parte do código recebe aquele valor
        /* Alem dele Temos:
        *  mais igual (+=), menos igual (-=), muiltiplicação igual (*=), divisão igual (/=), resto igual (%=) */
        double bonus = 1800;

        // Se quisermos adicionar um bonus:
        bonus += 1000;
        System.out.println("Adicionando 1000 ao bonus: "+bonus);

        // Se quisermos subtrarir um bonus:
        bonus -= 100;
        System.out.println("Subtraindo 100 do bonus: "+bonus);

        //Se quisermos multiplicar o bonus:
        bonus *= 5;
        System.out.println("Multiplicando o bonus por 5: "+ bonus);

        // Se quisermos dividir o bonus:
        bonus /= 3;
        System.out.println("Dividindo o bonus por 3: "+bonus);

        // Se quisermos o resto:
        bonus %= 5;
        System.out.println("Pegando o resto da divisão do bonus: "+bonus);

        // Existem também os operadores binários:
        // Por exemplo ++, se quisermos fazer um laço de repetição e pedir pra ele incrementar um valor, podemos usar isso
    }
}
