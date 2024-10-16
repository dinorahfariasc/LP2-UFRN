public class Lampada {
    // Atributos da classe Lâmpada
    private boolean acesa;
    
    // Método para acender a lâmpada
    public void acender() {
        acesa = true;
        System.out.println("A lâmpada está acesa.");
    }
    
    // Método para desligar a lâmpada
    public void desligar() {
        acesa = false;
        System.out.println("A lâmpada está apagada.");
    }
    
    // Método para verificar se a lâmpada está acesa ou apagada
    public boolean isAcesa() {
        return acesa;
    }
}