import java.util.Scanner;

class Cliente {
    private String nome;
    private String documento;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}

class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o documento do cliente: ");
        String documento = scanner.nextLine();
        Cliente cliente1 = new Cliente(nome, documento);

        
        ContaBancaria conta1 = new ContaBancaria(cliente1);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta1.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
