package Interfaces;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome + ", Salário Base: R$" + salarioBase);
    }

    public abstract double calcularPagamento();
}

interface Bonus {
    double calcularBonus();
}

class FuncionarioHorista extends Funcionario implements Bonus {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double salarioBase, double horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public double calcularBonus() {
        return calcularPagamento() * 0.10; 
    }
}


class FuncionarioAssalariado extends Funcionario implements Bonus {
    private double gratificacao;

    public FuncionarioAssalariado(String nome, double salarioBase, double gratificacao) {
        super(nome, salarioBase);
        this.gratificacao = gratificacao;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + gratificacao;
    }

    @Override
    public double calcularBonus() {
        return gratificacao * 0.20; 
    }
}


public class interface2 {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("dinorah", 0.0, 40, 150);
        horista.exibirInformacoes();
        System.out.println("Pagamento: R$" + horista.calcularPagamento());
        System.out.println("Bônus: R$" + ((Bonus) horista).calcularBonus());

        System.out.println();

        Funcionario assalariado = new FuncionarioAssalariado("vitoria", 1500, 500);
        assalariado.exibirInformacoes();
        System.out.println("Pagamento: R$" + assalariado.calcularPagamento());
        System.out.println("Bônus: R$" + ((Bonus) assalariado).calcularBonus());
    }
}
