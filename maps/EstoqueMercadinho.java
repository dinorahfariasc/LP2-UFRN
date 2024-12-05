package maps;

import java.util.HashMap;
import java.util.Map;

public class EstoqueMercadinho {
    public static void main(String[] args) {
        Map<Integer, Produto> estoque = new HashMap<>();

        estoque.put(1, new Produto("arroz (1kg)", 20));
        estoque.put(2, new Produto("feijão (1kg)", 50));
        estoque.put(3, new Produto("coca-cola (2l)", 10));
        estoque.put(4, new Produto("detergente", 15));
        estoque.put(5, new Produto("papel higiênico", 40));
        estoque.put(6, new Produto("óleo de soja (900ml)", 25));
        estoque.put(7, new Produto("água mineral (1.5l)", 100));
        estoque.put(8, new Produto("sabão em pó (1kg)", 8));

        System.out.println("Produtos com quantidade inferior a 30 no estoque:");
        for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            Produto produto = entry.getValue();
            if (produto.getQuantidade() < 30) {
                System.out.println("ID: " + entry.getKey() 
                                 + ", Produto: " + produto.getNome() 
                                 + ", Quantidade: " + produto.getQuantidade());
            }
        }
    }
}

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
