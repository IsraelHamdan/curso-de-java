package Application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Insira o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Insira a nota do primeiro trimestre de " + aluno.nome + ": ");
        aluno.notaPrimeiroTrimestre = sc.nextDouble();

        System.out.println("Insira a nota do segundo trimestre de " + aluno.nome + ": ");
        aluno.notaSegundoTrimestre = sc.nextDouble();

        System.out.println("Insira a nota do primeiro trimestre de " + aluno.nome + ": ");
        aluno.notaTerceiroTrimestre = sc.nextDouble();

        System.out.println(aluno.situacao());


        sc.close();
    }
}
