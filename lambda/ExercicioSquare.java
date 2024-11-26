package lambda;

@FunctionalInterface
interface Square {
    double calculate(double number);
}

public class ExercicioSquare {
    public static void main(String[] args) {
        Square square = number -> number * number;

        double numero = 5.0;
        double resultado = square.calculate(numero);

        System.out.println("O quadrado de " + numero + " é: " + resultado);
    }
}
