import java.util.Locale;
import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca, codigoPeca2, numeroDePecas, numeroDePecas2;
        double precoPeca, precoPeca2, soma;

        System.out.println("Dados do primeiro produto: ");
        codigoPeca = sc.nextInt();
        numeroDePecas = sc.nextInt();
        precoPeca = sc.nextDouble();

        System.out.println("Dados do segundo produto: ");
        codigoPeca2 = sc.nextInt();
        numeroDePecas2 = sc.nextInt();
        precoPeca2 = sc.nextDouble();

        soma = (double) (numeroDePecas * precoPeca) + (numeroDePecas2 * precoPeca2);

        System.out.printf("Valor a pagar: R$ %.2f%n", soma);

        sc.close();
    }
}
