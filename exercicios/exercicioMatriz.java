import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[8][8];

        System.out.println("Digite a posicao da torre:");
        int pos1 = sc.nextInt();
        System.out.println("Digite a posicao da torre:");
        int pos2 = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i == pos1 -1 || j == pos2-1){
                    matriz[i][j] = "X";
                }
                else{
                    matriz[i][j] = "0";
                    
                }
            }
        }
        sc.close();

        // mostrando a matriz 
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
