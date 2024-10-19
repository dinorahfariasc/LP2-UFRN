import java.util.Scanner;

public class NumeroEuler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da série: ");
        int n = scanner.nextInt();
        double euler = 0;

        for (int i = 0; i < n; i++) {
            euler += 1.0 / fatorial(i);
            System.out.printf("Termo %d: %.6f%n", i, euler);
        }

        scanner.close();
    }

    private static long fatorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
