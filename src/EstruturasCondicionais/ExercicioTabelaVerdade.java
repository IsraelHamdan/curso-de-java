package EstruturasCondicionais;

public class ExercicioTabelaVerdade {
    public static void main(String[] args) {
        /*Dado determinado valor de salário anual, estime o valor do salário*/
        double salarioAnual = 28.783;

        if (salarioAnual > 0 & salarioAnual < 34.712) {
            System.out.println("Valor od imposto: 9,70%");
        } else if (salarioAnual >= 34.712 & salarioAnual <= 68.500) {
            System.out.println("Valor do imposto: 37,35%");
        } else {
            System.out.println("Valor do imposto: 49,50%");
        }
    }
}
