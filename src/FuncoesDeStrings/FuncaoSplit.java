package FuncoesDeStrings;

public class FuncaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";
        String[] vector = s.split(" ");

        String palavra1 = vector[0];
        String palavra2 = vector[1];
        String word3 = vector[2];

        System.out.println(palavra1);
        System.out.println(palavra2);
        System.out.println(word3);
    }
}
