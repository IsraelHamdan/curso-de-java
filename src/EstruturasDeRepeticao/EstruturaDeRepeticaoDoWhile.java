package EstruturasDeRepeticao;

public class EstruturaDeRepeticaoDoWhile {
    public static void main(String[] args) {
        // No caso da estrutura Do while, ele vai funcionar pelo menos uma vez, independentemente da condição passada como parametro ser true ou false;
        int count =  0;
        do {
            count++;
            System.out.println(count + "numeros");
            System.out.println("Dentro do do-while");
        } while (count < 10);
    }
}
