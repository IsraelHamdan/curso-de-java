package EstruturasCondicionais;

public class ElseIf {
    //pulei o video 1 pq eu já sabia o conteúdo
    public static void main(String[] args) {
        /* Se quisermos verificar algo podemos adicionar uma estrutura condicional, no java temos:
         * if (se)
         * else (se não)
         * else if (se não se)
         */
        int idade = 23;
        if (idade != 18) {
            System.out.println("você pode tirar carteira de motorista");
        } else {
            System.out.println("você não pode tirar carteira de motorista");
        }
        // DESAFIO:
        //Se idade < 15, categoria infantil
        //Se idade >= 15 e < 18, categoria juvenil
        // Se idade  >= 18, categoria adulto
        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 & idade < 18) {
            System.out.println("Catetegoria: juvenil");
        } else {
            System.out.println("Categoria: adulto");
        }

    }
}

