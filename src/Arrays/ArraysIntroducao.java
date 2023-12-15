package Arrays;


public class ArraysIntroducao {
    public static void main(String[] args) {
        // No java temos que fazer dessa forma: tipo_do_array declaracao_de_array = new o tipo e dentro do colchetes o número de espaço de memória
        int [] idades = new int[3];
        // Podemos preencher manualmente o array dessa forma:
        idades[0] = 21;
        idades[1] = 10;
        idades[2] = 5;
        System.out.println(idades[2]);
        System.out.println(idades[1]);
        System.out.println(idades[0]);

    }
}
