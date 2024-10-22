import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[3][2];
        int[][] resultado = new int[2][2];

        System.out.println("preencha a matriz A (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("preencha a matriz B (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("resultado da multiplicação:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
