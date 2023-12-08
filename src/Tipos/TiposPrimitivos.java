package Tipos;

public class TiposPrimitivos {
    public static void main(TipoString[] args) {
        // Tipos primitivos são guardam valores simples
        // No java temos 8 tipos diferentes de tipos primitivos
        // São eles: int, float, double, char, byte, short, long, boolean

        // suporta até 4 bytes, vai de -2,147,483,648 até 2,147,483,647
        int idadeTipoInt = 10;
        System.out.println("Valor da variável idadeInput "+ idadeTipoInt);

        // Tem mais espaço na memória, e comporta numeros muito grandes
        long bigDamage = 332365000;
        System.out.println("Valor da variável bigDamage "+bigDamage);

        // suporta 8 bytes 1.7e-308 ate 3.4e+038
        double salarioTipoDouble = 2500;
        System.out.println("Valor da variável salarioTipoDouble "+salarioTipoDouble);

        // suporta 4 bytes 3.4e-038 até 3.4e+038
        float salarioTipoFloat = 2500;
        System.out.println("Valor da variável salarioTipoFloat " + salarioTipoFloat );
        // suporta 1 byte -128 até 127
        byte idadeTipoByte = 10;
        System.out.println("Valor da variável idadeTipoByte " + idadeTipoByte);

        // Só pode receber dois valores, true ou false, seu valor inicial é false
        boolean ehMaiorDeIdade = true;
        System.out.println(ehMaiorDeIdade);


        // O char só suporta 1 caracterer, ele também suporta numeros
        char caractere = 'w';
        System.out.println(caractere);
        System.out.println("Valor da variável caractere do tipo char" + caractere );


    }
}
