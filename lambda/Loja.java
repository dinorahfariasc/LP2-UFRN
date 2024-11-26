package lambda;
import java.util.*;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}

@FunctionalInterface
interface Desconto {
    double aplicar(Pessoa pessoa);
}

public class Loja {
    public static void main(String[] args) {
    
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("dinorah", 20, 2000),
                new Pessoa("analu", 20, 5000),
                new Pessoa("tazz", 20, 2500),
                new Pessoa("leticia", 22, 4000)
        );

    
        List<Pessoa> filtroPorIdade = pessoas.stream()
                .filter(p -> p.getIdade() >= 30)
                .collect(Collectors.toList());
        System.out.println("Pessoas com idade maior ou igual a 30:");
        filtroPorIdade.forEach(System.out::println);

        // Ordenar pessoas por nome
        List<Pessoa> ordenadoPorNome = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());
        System.out.println("\nPessoas ordenadas por nome:");
        ordenadoPorNome.forEach(System.out::println);

        
        Desconto desconto = pessoa -> pessoa.getSalario() * 0.9;
        List<Pessoa> comDesconto = pessoas.stream()
                .map(pessoa -> {
                    pessoa.setSalario(desconto.aplicar(pessoa));
                    return pessoa;
                })
                .collect(Collectors.toList());

        System.out.println("\nPessoas com desconto de 10% no salário:");
        comDesconto.forEach(System.out::println);
    }
}
