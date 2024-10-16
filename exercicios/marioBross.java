class Personagem {
    String nome;
    int vida;
    int pontuacao;
    boolean poder;

    void pular() {
        System.out.println(nome + " pulou!");
    }

    void coletarMoeda() {
        pontuacao += 1;
        System.out.println(nome + " coletou uma moeda! Pontuação: " + pontuacao);
    }

    void usarPoder() {
        poder = true;
        System.out.println(nome + " ativou o poder!");
    }
}

class Mario extends Personagem {
    Mario() {
        nome = "Mario";
        vida = 3;
        pontuacao = 0;
        poder = false;
    }

    void atacar() {
        System.out.println(nome + " atacou um inimigo!");
    }
}

class Inimigo {
    String tipo;
    int vida;

    Inimigo(String tipo) {
        this.tipo = tipo;
        this.vida = 2; // vida padrão
    }

    void atacar() {
        System.out.println(tipo + " está atacando!");
    }

    void receberDano() {
        vida -= 1;
        System.out.println(tipo + " recebeu dano! Vida restante: " + vida);
    }
}

class Item {
    String nome;
    String efeito;

    Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    void usar() {
        System.out.println("Usou o item: " + nome + ". Efeito: " + efeito);
    }
}

class Jogo {
    String nome;
    String nivel;

    Jogo(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    void iniciar() {
        System.out.println("Iniciando o jogo " + nome + " no nível " + nivel + "!");
    }

    void finalizar() {
        System.out.println("Jogo " + nome + " finalizado!");
    }
}

public class SuperMario {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.pular();
        mario.coletarMoeda();
        mario.usarPoder();
        mario.atacar();

        Inimigo goomba = new Inimigo("Goomba");
        goomba.atacar();
        goomba.receberDano();

        Item cogumelo = new Item("Cogumelo", "Aumenta a vida");
        cogumelo.usar();

        Jogo jogo = new Jogo("Super Mario Bros", "Mundo 1-1");
        jogo.iniciar();
        jogo.finalizar();
    }
}
