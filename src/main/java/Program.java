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
            System.out.printf("Digite o número %d" + ": ", i + 1);
            vetor[i] = sc.nextDouble();
        }

        Entities entities = new Entities(n, vetor);

        entities.imprime();

        double soma = entities.soma();
        double media = entities.media();

        System.out.println("A soma é: " + soma);
        System.out.println("A media é: " + media);



        sc.close();
    }
}
