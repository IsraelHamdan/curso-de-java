package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;

    public double tax;

    public double salarioLiquido () {
        return salarioBruto - tax;
    }

    public void IncreasedSalary (double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return nome +", $" + String.format("%.2f", salarioLiquido());
    }



}
