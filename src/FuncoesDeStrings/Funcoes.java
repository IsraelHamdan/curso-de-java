package FuncoesDeStrings;



public class Funcoes {
    public static void main(String[] args) {
        String original  = "abcde FGIJ ABC abc DEFG";
        System.out.println("Saída original: "+ original);

        // trasnformando tudo em minusculo:
        String saida1 = original.toLowerCase();
        System.out.println("toLowerCase: -" + saida1 + "-");

        // transformadno tudo em minusculo:
        String saida2 = original.toUpperCase();
        System.out.println("toUpperCase: -" + saida2 + "-");

        // tirando os espaços em branco:
        String saida3 = original.trim();
        System.out.println("trim: -" + saida3 + "-");

        /*Metódo Substring:
           * A string passada como referencia, no nosso caso é a que está armazenada na variavel orginial é como um array
           * cada string é como se fosse o elemento do array
           * quando passamos o parametro pra função substring temos que passar um numero e ele vai fazer uma nova string
           * dessa posição em diante!
        */
        // fazendo uma nova string de uma determinada posicção até o final do array
        String saida4 = original.substring(2);
        System.out.println("Criando uma nova string: " + saida4);
        // fazendo uma nova string de uma determinada posição inicial, até uma determinada posição final
        String saida5 = original.substring(2, 9);
        System.out.println("Fazendo uma nova string apartir de uma posição inical (2), até o outra posição (9) " + saida5);

        /* Substituindo strings: voce so precisa passar como parametro, aquilo que vc quer substituir, por aquilo que vc
            quer que substitua aquilo
         */
        String saida6 = original.replace('a', 'x');
        System.out.println("Trocando strings por outras, neste caso trocamos o 'a' pelo 'x' - "+saida6 + "-");

        //Ainda tem como saber a posição de uma determinada string, tanto a primeira quanto a ultima
        int i  = original.indexOf("bc");
        System.out.println("Primeira posição de 'bc' "+i);
        int j  = original.lastIndexOf("bc");
        System.out.println("ultima posição de 'bc' "+j);

    }
}
