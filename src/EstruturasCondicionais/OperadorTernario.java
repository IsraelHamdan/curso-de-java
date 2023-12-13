package EstruturasCondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        /*Existe a possiblidade de fazermos as verificações dentro das variáveis! */
        double salario = 4000;
        String mensagemPositiva = "Eu vou doar 500 para causas humanitárias";
        String mensagemNegativa = "Eu ainda não tenho condições, mas vou ter";

        String resultado = salario >= 5000 ? mensagemPositiva : mensagemNegativa;
        System.out.println(resultado);


    }
}
