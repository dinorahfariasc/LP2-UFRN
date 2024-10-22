import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        System.out.println("insira a sequência numérica:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("sequência invertida:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
