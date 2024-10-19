import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número natural inteiro par: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 != 0) {
            System.out.println("O número deve ser par.");
            scanner.close();
            return;
        }

        int divisor = 1;
        System.out.print("Divisores de " + numero + ": ");
        
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
        
        System.out.println();
        scanner.close();
    }
}
