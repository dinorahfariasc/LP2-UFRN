package associacaoCompAgre;

// Composição
class Carro {
    private Motor motor;
    private Pneu[] pneus;
    private Radio radio; 
    private Motorista motorista; 

    public Carro() {
        this.motor = new Motor();
        this.pneus = new Pneu[5]; 
        for (int i = 0; i < 5; i++) {
            this.pneus[i] = new Pneu();
        }
    }

    public void instalarRadio(Radio radio) {
        this.radio = radio;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void detalhesDoCarro() {
        System.out.println("Detalhes do carro:");
        System.out.println("Motor: " + motor);
        System.out.println("Pneus instalados: " + pneus.length);
        System.out.println("Radio: " + (radio != null ? "Instalado" : "Não instalado"));
        System.out.println("Motorista: " + (motorista != null ? motorista.getNome() : "Sem motorista"));
    }
}

// Composição
class Motor {
    public Motor() {
        System.out.println("Motor criado e instalado no carro.");
    }

    @Override
    public String toString() {
        return "Motor padrão do carro";
    }
}

// Composição
class Pneu {
    public Pneu() {
        System.out.println("Pneu criado e instalado no carro.");
    }
}

// Agregação
class Radio {
    private String marca;

    public Radio(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rádio de marca: " + marca;
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Motorista extends Pessoa {
    public Motorista(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Motorista: " + getNome();
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Radio radio = new Radio("Pioneer");
        carro.instalarRadio(radio);

        Motorista motorista = new Motorista("Dinorah");
        carro.setMotorista(motorista);

        carro.detalhesDoCarro();
    }
}
