import java.util.Locale;
import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double precoHoraTrabalhada, salario;

        System.out.println("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Preço da hora trabalhada: ");
        precoHoraTrabalhada = sc.nextDouble();

        salario = (double) horasTrabalhadas * precoHoraTrabalhada;

        System.out.printf("Número do funcionário: %d%n", numeroFuncionario);
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();
    }
}
