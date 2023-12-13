package EstruturasCondicionais;

public class EstruturaCondicionalSwitchCase {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        int dia = 4;
        // Dentro do parametro do switch só podem ser passados alguns tipos de parametro: int, char, byte, short, Character, Byte, String, Integer, enum;

        // Toda vez que terminamos de dizer a instrução dentro do case, precisamos colocar o break, para que o compilador pare ali

        // Ainda é possível definir uma ação padrão a ser tomada caso não caia em nenhum caso, dazemos isso colocando o default

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia não encontrado!");
                break;
        }
    }
}
