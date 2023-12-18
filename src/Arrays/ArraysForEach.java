package Arrays;

public class ArraysForEach {
    public static void main(String[] args) {
        /*Além daquela forma que vimos de iniciar o array, ainda temos essa possibilidade*/
        int[] numeros = {1, 2, 3, 4, 5};
        // O ruim dessa forma é que toda vez que vc quiser alterar o array, vc só vai poder fazer se mexer  no código
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
        /*Existe ainda uma outra forma de declarar os arrays
            * Precisa de:
                *  uma variavel local, do mesmo tipo dos valores do array: nomeDoArray
            */
        for(int num: numeros) {
            System.out.println(num);
        }
    }
}
