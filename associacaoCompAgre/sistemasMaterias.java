package associacaoCompAgre;

import java.util.ArrayList;
import java.util.List;

class Aula {
    private String titulo;       
    private boolean concluida;   

    public Aula(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public void resetar() {
        this.concluida = false;
    }
}


class Curso {
    private String nome;             
    private List<Aula> aulas;         
    private boolean concluido;        
    private String ativo;  // Estado do curso (Inativo, Em Andamento, Concluído)

    public Curso(String nome) {
        this.nome = nome;
        this.aulas = new ArrayList<>();
        this.concluido = false;
        this.ativo = "Inativo";  // O curso começa com status "Inativo"
    }

    public String getNome() {
        return nome;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
        atualizarEstadoCurso();  // Atualiza o estado do curso sempre que uma aula é adicionada
    }

    public void concluirCurso() {
        this.concluido = true;
        this.ativo = "Concluído";  // Curso finalizado
        limparAulas();  
    }

    private void limparAulas() {
        aulas.clear(); 
    }

    public void exibirAulas() {
        if (concluido) {
            System.out.println("O curso " + nome + " foi concluído.");
        } else {
            System.out.println("Aulas do curso " + nome + " (" + ativo + "):");
            for (Aula aula : aulas) {
                System.out.println("- " + aula.getTitulo() + " (Concluída: " + aula.isConcluida() + ")");
            }
        }
    }

    public void concluirAula(int indice) {
        if (indice >= 0 && indice < aulas.size()) {
            aulas.get(indice).marcarComoConcluida();
            System.out.println("A aula '" + aulas.get(indice).getTitulo() + "' foi marcada como concluída.");
            atualizarEstadoCurso();  // Atualiza o estado do curso após marcar uma aula como concluída
        } else {
            System.out.println("Índice de aula inválido!");
        }
    }

    // Método que atualiza o estado do curso (ativo)
    private void atualizarEstadoCurso() {
        boolean todasConcluidas = true;
        boolean algumaConcluida = false;

        for (Aula aula : aulas) {
            if (aula.isConcluida()) {
                algumaConcluida = true;
            } else {
                todasConcluidas = false;
            }
        }

        if (todasConcluidas) {
            this.ativo = "Concluído";
        } else if (algumaConcluida) {
            this.ativo = "Em Andamento";
        } else {
            this.ativo = "Inativo";
        }
    }
    
        public String getAtivo() {
            return ativo;
        }
    }
    
    
    class Usuario {
        private String nome;             
        private List<Curso> cursos;
    
        public Usuario(String nome) {
            this.nome = nome;
            this.cursos = new ArrayList<>();
        }
    
        public String getNome() {
            return nome;
        }
    
        public void inscreverEmCurso(Curso curso) {
            cursos.add(curso);
            System.out.println(nome + " se inscreveu no curso " + curso.getNome());
        }
    
        public void visualizarCursos() {
            if (cursos.isEmpty()) {
                System.out.println(nome + " não está inscrito em nenhum curso.");
            } else {
                System.out.println(nome + " está inscrito nos seguintes cursos:");
                for (Curso curso : cursos) {
                    System.out.println("- " + curso.getNome() + " (Status: " + curso.getAtivo() + ")");
                curso.exibirAulas();  
            }
        }
    }

    public void concluirCurso(Curso curso) {
        if (cursos.contains(curso)) {
            curso.concluirCurso();
            cursos.remove(curso);
            System.out.println("O curso " + curso.getNome() + " foi concluído. " + nome);
        } else {
            System.out.println("Você não está inscrito nesse curso.");
        }
    }

    public void concluirAula(Curso curso, int indiceAula) {
        if (cursos.contains(curso)) {
            curso.concluirAula(indiceAula);
            System.out.println("A aula foi marcada como concluída.");
        } else {
            System.out.println("Você não está inscrito nesse curso.");
        }
    }
}


public class sistemasMaterias {
    public static void main(String[] args) {
    
        Usuario usuario = new Usuario("dinorah");

        Curso cursoJava = new Curso("LP2");
        Aula aula1 = new Aula("Introdução ao Java");
        Aula aula2 = new Aula("Sintaxe Básica");
        Aula aula3 = new Aula("Orientação a Objetos");

        cursoJava.adicionarAula(aula1);
        cursoJava.adicionarAula(aula2);
        cursoJava.adicionarAula(aula3);

        Curso cursoPython = new Curso("Ciencia de dados");
        Aula aula4 = new Aula("Introdução ao Python");
        Aula aula5 = new Aula("Manipulação de Dados");
        Aula aula6 = new Aula("Visualização de Dados");

        cursoPython.adicionarAula(aula4);
        cursoPython.adicionarAula(aula5);
        cursoPython.adicionarAula(aula6);
       

        System.out.println("=======================================");
       
        usuario.inscreverEmCurso(cursoJava);

        System.out.println("=======================================");
        usuario.visualizarCursos();

        System.out.println("=======================================");
        usuario.concluirAula(cursoJava, 0);  
        usuario.concluirAula(cursoJava, 1);  

        usuario.inscreverEmCurso(cursoPython);

        System.out.println("=======================================");
        usuario.visualizarCursos();
        
        System.out.println("=======================================");
        usuario.concluirCurso(cursoJava);
        usuario.concluirAula(cursoPython,1);
        
        System.out.println("=======================================");
        usuario.visualizarCursos();
    }
}
