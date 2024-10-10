import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        // Preenchendo a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j]; // Somando os elementos
            }
        }

        // Exibindo a soma dos elementos da matriz
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
    }
}
