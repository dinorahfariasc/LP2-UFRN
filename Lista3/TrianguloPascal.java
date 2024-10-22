import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número inteiro positivo (n): ");
        int n = scanner.nextInt();

        for (int linha = 0; linha < n; linha++) {
            int coeficiente = 1;
            for (int espaco = 0; espaco < n - linha - 1; espaco++) {
                System.out.print(" ");
            }
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(coeficiente + " ");
                coeficiente = coeficiente * (linha - coluna) / (coluna + 1);
            }
            System.out.println();
        }
    }
}
