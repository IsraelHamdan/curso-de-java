package Arrays;

public class PadroesDeValoresDeArrays {
    public static void main(String[] args) {
        // byte, short, int, long, float, double => O valor padrão vai ser 0;
        // char '\u0000' => O valor do padrão é uma string vazia '';
        // boolean => o valor padrão vai ser false;
        // String => o valor padrão vai ser null;
        String[] personagens =  new String[3];
        personagens[0] = "Naruto";
        personagens[1] = "Madara";
        personagens[2] = "Luffy";

        // imprimindo os elementos do array dinamicamente
        for (int i = 0; i <= personagens.length ; i++) {
            System.out.println(personagens[i]);
        }

    }
}
