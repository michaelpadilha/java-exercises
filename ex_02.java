import java.util.Locale;
import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Digite um número:");
        x = sc.nextInt();
        System.out.println("Digite outro número:");
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("A soma desses dois números é %d%n", soma);

        sc.close();

    }
}
