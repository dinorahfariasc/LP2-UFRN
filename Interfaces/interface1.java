package Interfaces;

abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void realizarPagamento();
}


interface Autenticacao {
    void autenticar();
}

class CartaoCredito extends Pagamento implements Autenticacao {
    private String numeroCartao;

    public CartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticando o cartão de crédito número: " + numeroCartao);
    }
}

class BoletoBancario extends Pagamento implements Autenticacao {
    private String codigoBoleto;

    public BoletoBancario(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com Boleto Bancário.");
    }

    @Override
    public void autenticar() {
        System.out.println("Validando o código do boleto: " + codigoBoleto);
    }
}

class PIX extends Pagamento implements Autenticacao {
    private String chavePIX;

    public PIX(double valor, String chavePIX) {
        super(valor);
        this.chavePIX = chavePIX;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticando a chave PIX: " + chavePIX);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(6000.0, "52351854620");
        ((Autenticacao) cartao).autenticar();
        cartao.realizarPagamento();

        Pagamento boleto = new BoletoBancario(120.0, "6516512");
        ((Autenticacao) boleto).autenticar();
        boleto.realizarPagamento();

        Pagamento pix = new PIX(500.0, "dinorah@farias.com");
        ((Autenticacao) pix).autenticar();
        pix.realizarPagamento();
    }
}
