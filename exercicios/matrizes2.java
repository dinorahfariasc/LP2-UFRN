import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz de acordo com os critérios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else if (i < j) {
                    matriz[i][j] = 2; // Parte superior
                } else {
                    matriz[i][j] = 3; // Parte inferior
                }
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
