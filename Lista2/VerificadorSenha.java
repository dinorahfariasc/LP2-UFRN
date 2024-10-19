import java.util.Scanner;

public class VerificadorSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha == 1234) {
                System.out.println("ACESSO PERMITIDO");
            } else {
                System.out.println("ACESSO NEGADO");
            }
        } while (senha != 1234);

        scanner.close();
    }
}
