import java.util.Locale;
import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio do círculo:");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("Área do círculo: %.4f%n", area);

        sc.close();
    }
}
