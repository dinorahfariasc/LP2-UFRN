import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Carro {
    private String modelo;
    private String placa;
    private boolean disponivel;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.disponivel = true; // O carro está disponível ao ser criado
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Carro já está alugado.");
        }
    }

    public void devolver() {
        disponivel = true;
    }
}

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

class Reserva {
    private Carro carro;
    private Cliente cliente;

    public Reserva(Carro carro, Cliente cliente) {
        if (carro.isDisponivel()) {
            this.carro = carro;
            this.cliente = cliente;
            carro.alugar();
            System.out.println("Reserva feita com sucesso para " + cliente.getNome() + " - Carro: " + carro.getModelo());
        } else {
            System.out.println("Carro não disponível para reserva.");
        }
    }

    public Carro getCarro() {
        return carro;
    }

    public void devolverCarro() {
        if (carro != null) {
            carro.devolver();
            System.out.println("Carro " + carro.getModelo() + " devolvido com sucesso.");
        } else {
            System.out.println("Nenhuma reserva ativa.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        
        // Criando um carro inicial
        carros.add(new Carro("Fusca", "ABC-1234"));

        Cliente cliente = null;
        Reserva reserva = null;
        
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Reservar carro");
            System.out.println("3 - Devolver carro");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    // Cadastrar novo carro
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite a placa do carro: ");
                    String placa = scanner.nextLine();
                    carros.add(new Carro(modelo, placa));
                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    // Reservar carro
                    if (cliente == null) {
                        System.out.print("Digite o nome do cliente: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o documento do cliente: ");
                        String documento = scanner.nextLine();
                        cliente = new Cliente(nome, documento);
                    }

                    System.out.print("Digite o modelo do carro a ser reservado: ");
                    String modeloReserva = scanner.nextLine();
                    Carro carroReserva = encontrarCarro(modeloReserva, carros);
                    if (carroReserva != null) {
                        reserva = new Reserva(carroReserva, cliente);
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;

                case 3:
                    // Devolver carro
                    if (reserva != null) {
                        reserva.devolverCarro();
                        reserva = null; // Limpa a reserva após a devolução
                        cliente = null; // Limpa o cliente após a devolução
                    } else {
                        System.out.println("Nenhuma reserva ativa.");
                    }
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

    private static Carro encontrarCarro(String modelo, List<Carro> carros) {
        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo)) {
                return carro;
            }
        }
        return null;
    }
}
