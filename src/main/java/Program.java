import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de números que deseja fazer a média: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("A média é: %.2f%n", media);

        sc.close();
    }
}
