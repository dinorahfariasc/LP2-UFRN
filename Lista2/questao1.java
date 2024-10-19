import java.util.Scanner;

public class AvaliadorAluno {

    public static String avaliarAluno(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        boolean notasValidas = (nota1 >= 4.0) && (nota2 >= 4.0) && (nota3 >= 4.0);

        if (media >= 6.0 && notasValidas) {
            return "Aprovado";
        } else if (media < 6.0 && notasValidas) {
            return "Pode fazer a prova de reposição";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        String resultado = avaliarAluno(nota1, nota2, nota3);
        System.out.println(resultado);

        scanner.close();
    }
}
