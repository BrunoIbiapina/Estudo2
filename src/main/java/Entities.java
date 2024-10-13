public class Entities {

    private int n;
    private double[] vetor;

    public Entities(int n, double[] vetor) {
        this.n = n;
        this.vetor = new double[n];

        for (int i = 0; i < n; i++) {
            this.vetor[i] = vetor[i];
        }

    }

    public void imprime() {
        System.out.println("Números inserios: ");
        for (double num : vetor) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public double soma() {
        double sum = 0;
        for (double num : vetor) {
            sum += num;
        }
        return sum;

    }

    public double media() {
        return soma() / n;
    }


}












