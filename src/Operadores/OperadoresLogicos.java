package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // no java os operadores lógicos sempre vão retornar um valor booleano
        // são eles: maior (>), menor (<), maior igual (>=), menor igual (<=), igual (==), diferente (!=)

        // no Java temos um padrão que, toda vez que vamos fazer uma verificação numa variável, colocamos o is antes do nome dela
        int n1 = 30;
        int n2 = 20;

        boolean isN1maiorQueN2 = n1 > n2;
        System.out.println(isN1maiorQueN2);

        boolean isN1MenorQueN2 = n1 < n2;
        System.out.println(isN1MenorQueN2);

        boolean isN2MaiorQueN1 = n2 > n1;
        System.out.println(isN2MaiorQueN1);

        boolean isN2MenorQueN1 = n2 < n1;
        System.out.println(isN2MenorQueN1);

        boolean isN1IgualAN2 = n1 == n2;
        System.out.println(isN1IgualAN2);

        boolean isN1DiferenteDeN2 = n1 != n2;
        System.out.println(isN1DiferenteDeN2);
    }
}
