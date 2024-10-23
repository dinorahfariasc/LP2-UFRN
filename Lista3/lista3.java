import java.util.Scanner;

class Retangulo {
    private double altura;
    private double largura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return (largura * 2) + (altura * 2);
    }
}

class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public void setCatetoBase(double catetoBase) {
        this.catetoBase = catetoBase;
    }

    public void setCatetoAltura(double catetoAltura) {
        this.catetoAltura = catetoAltura;
        calcularHipotenusa();
    }

    private void calcularHipotenusa() {
        hipotenusa = Math.sqrt((catetoBase * catetoBase) + (catetoAltura * catetoAltura));
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public double area() {
        return (catetoBase * catetoAltura) / 2;
    }

    public double perimetro() {
        return catetoBase + catetoAltura + hipotenusa;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.print("Digite a altura do retângulo: ");
        retangulo.setAltura(scanner.nextDouble());
        System.out.print("Digite a largura do retângulo: ");
        retangulo.setLargura(scanner.nextDouble());
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        TrianguloRetangulo triangulo = new TrianguloRetangulo();
        System.out.print("Digite a base do triângulo: ");
        triangulo.setCatetoBase(scanner.nextDouble());
        System.out.print("Digite a altura do triângulo: ");
        triangulo.setCatetoAltura(scanner.nextDouble());
        System.out.println("Hipotenusa do triângulo: " + triangulo.getHipotenusa());
        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Perímetro do triângulo: " + triangulo.perimetro());

        scanner.close();
    }
}
