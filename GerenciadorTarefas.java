import java.util.Scanner;

class Tarefa {
    String descricao;
    Tarefa proxima;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.proxima = null;
    }
}

class ListaTarefas {
    private Tarefa cabeca;
    private int tamanho;

    public ListaTarefas() {
        cabeca = null;
        tamanho = 0;
    }

    public void adicionar(String descricao) {
        Tarefa nova = new Tarefa(descricao);
        if (cabeca == null) {
            cabeca = nova;
        } else {
            Tarefa atual = cabeca;
            while (atual.proxima != null) {
                atual = atual.proxima;
            }
            atual.proxima = nova;
        }
        tamanho++;
    }

    public void remover(String descricao) {
        Tarefa atual = cabeca;
        Tarefa anterior = null;

        while (atual != null && !atual.descricao.equals(descricao)) {
            anterior = atual;
            atual = atual.proxima;
        }

        if (atual != null) {
            if (anterior == null) {
                cabeca = atual.proxima; // Remover a tarefa do início
            } else {
                anterior.proxima = atual.proxima; // Remover do meio ou fim
            }
            tamanho--;
        }
    }

    public void listar() {
        Tarefa atual = cabeca;
        if (atual == null) {
            System.out.println("nenhuma tarefa cadastrada.");
            return;
        }
        int indice = 1;
        while (atual != null) {
            System.out.println(indice + ". " + atual.descricao);
            atual = atual.proxima;
            indice++;
        }
    }
}

public class GerenciadorTarefas {

    public static long obterMemoriaUsada() {
        int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / MB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();
        String acao;

        System.out.println("memoria inicial: " + obterMemoriaUsada() + " MB");

        while (true) {
            System.out.println("\nEscolha uma opcao: (1) Adicionar (2) Remover (3) Listar (4) Sair");
            acao = scanner.nextLine();

            if (acao.equals("1")) {
                System.out.print("Digite a descricao da tarefa: ");
                String descricao = scanner.nextLine();
                
                long memoriaAntes = obterMemoriaUsada();
                lista.adicionar(descricao);
                long memoriaDepois = obterMemoriaUsada();
                
                System.out.println("tarefa adicionada.");
                System.out.println("memoria antes: " + memoriaAntes + " MB, memoria depois: " + memoriaDepois + " MB");

            } else if (acao.equals("2")) {
                System.out.print("Digite a descricao da tarefa para remover: ");
                String descricao = scanner.nextLine();
                
                long memoriaAntes = obterMemoriaUsada();
                lista.remover(descricao);
                long memoriaDepois = obterMemoriaUsada();
                
                System.out.println("tarefa removida.");
                System.out.println("memoria antes: " + memoriaAntes + " MB, memoria depois: " + memoriaDepois + " MB");

            } else if (acao.equals("3")) {
                System.out.println("tarefas na lista:");
                lista.listar();
                long memoriaAtual = obterMemoriaUsada();
                System.out.println("memoria atual: " + memoriaAtual + " MB");

            } else if (acao.equals("4")) {
                break;
            } else {
                System.out.println("opcao invalida.");
            }
        }

        System.out.println("memoria final: " + obterMemoriaUsada() + " MB");
        scanner.close();
    }
}
