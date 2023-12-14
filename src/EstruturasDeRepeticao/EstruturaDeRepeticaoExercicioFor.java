package EstruturasDeRepeticao;

public class EstruturaDeRepeticaoExercicioFor {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000;
        // meu teste
//        for (int i = 0; i <= 1000000; i++) {
//            float restoDaDivisao = i % 2;
//            if(restoDaDivisao == 0) {
//                System.out.println(restoDaDivisao);
//            }
//        }
        //dev dojo
        for (int i = 0; i < 1000000; i++) {
            float resto = i % 2;
            if(resto == 0) {
                System.out.println(i);
            }
        }
    }
}
