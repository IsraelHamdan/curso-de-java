package entities;

public class Aluno {
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double soma;

    public  String status;

    public String  situacao () {
        soma = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
        if (soma >= 60.0) {
            status = soma + "\nPASS";
        } else {
            status = "\n"+ soma + "\nFAILD";
        }
        return status;
    }


}
