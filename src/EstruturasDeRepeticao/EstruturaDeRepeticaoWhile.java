package EstruturasDeRepeticao;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        // Temos basicamente: while, do while, for, nesta aula vamos ver apenas o laço while!
        // a estrutura de repetição sempre vai precisar de um contador!
        int contador = 0;

        // O while ele precisa de um booleano como parametro, só que o booleano sempre tem que ser positivo!
        while (contador <= 100) {
            System.out.println(contador);
            contador++; // ++ é o operador aritimetico para acrescentar 1;
        }

        // ele sempre vai ficar voltanto da linha 9 pra linha 7, até que o contador seja preenchido
    }
}
