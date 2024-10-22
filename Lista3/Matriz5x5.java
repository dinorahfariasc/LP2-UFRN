import java.util.Scanner;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        System.out.println("preencha a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("maior valor: " + maiorValor + " na posição: linha " + (linhaMaior + 1) + ", coluna " + (colunaMaior + 1));
    }
}
