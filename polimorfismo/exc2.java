class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }

    public void imprimeValor() {
        System.out.println("Valor: R$" + valor);
    }
}

class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valorIngressoVIP() {
        return getValor() + adicional;
    }
}

class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValor() {
        System.out.println("Ingresso normal");
    }
}

class CamaroteInferior {
    private String localizacao;

    public CamaroteInferior(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localizacao: " + localizacao);
    }
}

class CamaroteSuperior extends VIP {
    private double adicionalSuperior;

    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior) {
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
    }

    public double valorIngressoCamaroteSuperior() {
        return super.valorIngressoVIP() + adicionalSuperior;
    }
}

public class exc2 {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50);
        ingressoNormal.imprimeValor();

        VIP ingressoVIP = new VIP(50, 30);
        System.out.println("ingresso vip: " + ingressoVIP.valorIngressoVIP());

        CamaroteInferior camaroteInferior = new CamaroteInferior("balcao nobre");
        camaroteInferior.imprimeLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50, 30, 50);
        System.out.println("ingresso rei do camarote: " + camaroteSuperior.valorIngressoCamaroteSuperior());
    }
}
