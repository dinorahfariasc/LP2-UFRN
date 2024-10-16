class Lampada {
    private boolean ligada;
    private int vermelho;
    private int verde;
    private int azul;
    private int brilho;

    public Lampada(int vermelho, int verde, int azul, int brilho) {
        this.ligada = false;
        setCor(vermelho, verde, azul);
        setBrilho(brilho);
    }

    public void acender() {
        ligada = true;
        System.out.println("lâmpada acesa.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("lâmpada apagada.");
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setCor(int vermelho, int verde, int azul) {
        if (isCorValida(vermelho, verde, azul)) {
            this.vermelho = vermelho;
            this.verde = verde;
            this.azul = azul;
            System.out.println("cor da lampada rgb(" + vermelho + ", " + verde + ", " + azul + ").");
        } else {
            System.out.println("valor inválido, deve estar entre 0 e 255..");
        }
    }

    public void setBrilho(int brilho) {
        if (brilho >= 0 && brilho <= 255) {
            this.brilho = brilho;
            System.out.println("brilho = " + brilho + ".");
        } else {
            System.out.println("valor inválido, deve estar entre 0 e 255.");
        }
    }

    public void exibirEstado() {
        String estado = ligada ? "acesa" : "apagada";
        System.out.println("lâmpada está " + estado + ". Cor: RGB(" + vermelho + ", " + verde + ", " + azul + "), Brilho: " + brilho + ".");
    }

    private boolean isCorValida(int vermelho, int verde, int azul) {
        return (vermelho >= 0 && vermelho <= 255) &&
               (verde >= 0 && verde <= 255) &&
               (azul >= 0 && azul <= 255);
    }
}

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(255, 200, 100, 128);
        lampada.exibirEstado();

        lampada.acender();
        lampada.exibirEstado();

        lampada.setCor(0, 255, 0);
        lampada.setBrilho(200);
        lampada.exibirEstado();

        lampada.desligar();
        lampada.exibirEstado();
    }
}
