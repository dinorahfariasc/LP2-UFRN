import java.util.Scanner;

public class ClassificadorCaractere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char caractere = input.charAt(0);
            if (Character.isDigit(caractere)) {
                System.out.println(caractere + " é um número.");
            } else if (isVogal(caractere)) {
                System.out.println(caractere + " é uma vogal.");
            } else if (Character.isLetter(caractere)) {
                System.out.println(caractere + " é uma consoante.");
            } else {
                System.out.println(caractere + " é um símbolo.");
            }
        } else {
            System.out.println("Por favor, insira apenas um caractere.");
        }

        scanner.close();
    }

    private static boolean isVogal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
