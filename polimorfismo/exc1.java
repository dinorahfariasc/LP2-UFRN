
class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimir() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
    }
}

class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }


    public double getAdicional() {
        return adicional;
    }

    
    public void imprimirNovo() {
        super.imprimir(); 
        System.out.println("adicional no preço do imovel novo" + String.format("%.2f", adicional));
        System.out.println("preço total" + String.format("%.2f", getPreco() + adicional));
    }
}


class Velho extends Imovel {
    private double desconto;
   
    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void imprimirVelho() {
        super.imprimir();
        System.out.println("desconto no preço do imovel velho:" + String.format("%.2f", desconto));
        System.out.println("preço total:" + String.format("%.2f", getPreco() - desconto));
    }
}

public class exc1 {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Boulevard saint lauren", 500000, 20000);
        System.out.println("imovel novinho:");
        imovelNovo.imprimirNovo();
        System.out.println();

        Velho imovelVelho = new Velho("linha vermelha, 456", 150000, 20000);
        System.out.println("imovel veio:");
        imovelVelho.imprimirVelho();
    }
}
