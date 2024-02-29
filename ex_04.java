import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite um número: ");
        a = sc.nextInt();
        System.out.println("Outro número: ");
        b = sc.nextInt();
        System.out.println("Outro número: ");
        c = sc.nextInt();
        System.out.println("Outro número: ");
        d = sc.nextInt();

        diferenca = (a*b) - (c*d);

        System.out.printf("Diferença: %d%n", diferenca);

        sc.close();
    }
}
