import java.util.Scanner;

public class MovimentosTorre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[8][8];

        System.out.print("digite a posição da torre (ex: A1): ");
        String posicao = scanner.next().toUpperCase();
        int linha = posicao.charAt(1) - '1';
        int coluna = posicao.charAt(0) - 'A';

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == linha || j == coluna) {
                    tabuleiro[i][j] = 'X';
                } else {
                    tabuleiro[i][j] = '-';
                }
            }
        }

        tabuleiro[linha][coluna] = 'T'; // representando a torre

        System.out.println("movimentos possíveis da torre:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
