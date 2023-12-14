package EstruturasDeRepeticao;

public class EstruturaDeRepeticaoBreakContinue {
    // Dado 50 numeros, imprima os primeiros 25 numeros!
    public static void EstruturaContiue( ) {
        /* no caso do continue, acontece ao contrario do break, quando ele chega na instrução continue ele volta pro
            inicio do laço
         */
        for (int i = 0; i <= 50 ; i++) {
            if(i == 25) {
                System.out.println(i);
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        for (int i = 0; i <= 50 ; i++) {
//            if(i == 25) {
//                System.out.println(i);
//                break;
//            }
//            System.out.println(i);
//        }
        EstruturaContiue();
    }


}
