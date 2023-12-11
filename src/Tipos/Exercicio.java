package Tipos;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio {
    // Exercicio 1!
    /*Crie variáveis para os campos abaixo descritos entre <> e imprima a seguinte mensagem:
    * Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data de <data>*/


    public static void main(String[] args) {
        String nome = "Israel";
        String endereco = "Rua dos Lirios, número: 459, Condominio Portal da Natureza, Bairro Alvorada, na cidade de Jequié";
        double salario = 25000.00;
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String mensagem = "Eu " + nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salario de: R$" + salario + ", na data de: " + data;
        System.out.println(mensagem);

    }
}
