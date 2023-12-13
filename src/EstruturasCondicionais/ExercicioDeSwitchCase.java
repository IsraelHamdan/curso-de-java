package EstruturasCondicionais;

public class ExercicioDeSwitchCase {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7 imprima se é dia util ou final de semana, considerando 1 como domingo
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("hoje é domingo, final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda, portanto é dia util, vai trabalhar preguiçoso");
                break;
            case 3:
                System.out.println("Hoje é terça, portanto é dia util, vai trabalhar preguiçoso");
                break;
            case 4:
                System.out.println("Hoje é quarta, portanto é dia util, vai trabalhar preguiçoso");
                break;
            case 5:
                System.out.println("Hoje é quinta, portanto é dia util, vai trabalhar preguiçoso");
                break;
            case 6:
                System.out.println("Hoje é sexta, portanto é dia util, vai trabalhar preguiçoso");
                break;
            case 7:
                System.out.println("Hoje é sabado, portanto é final de semana");
                break;
        }
    }
}
