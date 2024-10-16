class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    void emprestar() {
        System.out.println("O livro '" + titulo + "' foi emprestado.");
    }

    void devolver() {
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }

    void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
    }
}

class Usuario {
    String nome;
    String matricula;
    int idade;

    void registrar() {
        System.out.println("Usuário " + nome + " registrado com a matrícula " + matricula + ".");
    }

    void solicitarEmprestimo(Livro livro) {
        System.out.println(nome + " solicitou o empréstimo do livro: " + livro.titulo);
        livro.emprestar();
    }

    void devolverLivro(Livro livro) {
        System.out.println(nome + " devolveu o livro: " + livro.titulo);
        livro.devolver();
    }
}

class Biblioteca {
    String nome;
    String endereco;
    int totalLivros;

    void abrir() {
        System.out.println("A biblioteca '" + nome + "' está agora aberta.");
    }

    void fechar() {
        System.out.println("A biblioteca '" + nome + "' está fechada.");
    }

    void adicionarLivro() {
        totalLivros++;
        System.out.println("Um livro foi adicionado. Total de livros: " + totalLivros);
    }
}

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;

        Usuario usuario1 = new Usuario();
        usuario1.nome = "Ana";
        usuario1.matricula = "2023001";
        usuario1.idade = 20;

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nome = "Biblioteca Central";
        biblioteca.endereco = "Rua das Flores, 123";
        biblioteca.totalLivros = 0;

        biblioteca.abrir();
        biblioteca.adicionarLivro();
        usuario1.registrar();
        usuario1.solicitarEmprestimo(livro1);
        usuario1.devolverLivro(livro1);
        biblioteca.fechar();
    }
}
