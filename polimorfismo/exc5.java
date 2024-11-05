import java.util.ArrayList;

class Correntista {
    private String cpfCliente;
    private float saldo;

    public Correntista(String cpfCliente, float saldo) {
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
}

class DespesasIndividuo {
    private float despesaMarço;

    public DespesasIndividuo(float despesaMarço) {
        this.despesaMarço = despesaMarço;
    }

    public float getDespesaMes(String mes) {
        if (mes.equalsIgnoreCase("março")) {
            return despesaMarço;
        }
        return 0;
    }
}


class CorrentistaDespesa extends Correntista {
    private DespesasIndividuo despesasPrevistas;

    public CorrentistaDespesa(String cpfCliente, float saldo, DespesasIndividuo despesas) {
        super(cpfCliente, saldo);
        this.despesasPrevistas = despesas;
    }

    public DespesasIndividuo getDespesasPrevistas() {
        return despesasPrevistas;
    }
}


class CorrentistaUtils {
    public static CorrentistaDespesa[] filtrarCorrentistasComDespesasAltas(CorrentistaDespesa[] correntistas) {
        ArrayList<CorrentistaDespesa> resultado = new ArrayList<>();

        for (CorrentistaDespesa correntista : correntistas) {
           
            if (correntista.getDespesasPrevistas().getDespesaMes("março") > correntista.getSaldo()) {
                resultado.add(correntista);
            }
        }
        return resultado.toArray(new CorrentistaDespesa[0]);
    }
}


public class exc5 {
    public static void main(String[] args) {
        DespesasIndividuo despesa1 = new DespesasIndividuo(1500);
        DespesasIndividuo despesa2 = new DespesasIndividuo(500);
        DespesasIndividuo despesa3 = new DespesasIndividuo(1200);

        CorrentistaDespesa correntista1 = new CorrentistaDespesa("001", 1000, despesa1);
        CorrentistaDespesa correntista2 = new CorrentistaDespesa("002", 800, despesa2);
        CorrentistaDespesa correntista3 = new CorrentistaDespesa("003", 1000, despesa3);

        CorrentistaDespesa[] correntistas = {correntista1, correntista2, correntista3};

        CorrentistaDespesa[] resultado = CorrentistaUtils.filtrarCorrentistasComDespesasAltas(correntistas);

        System.out.println("Correntistas com despesas previstas para março maiores que o saldo:");
        for (CorrentistaDespesa c : resultado) {
            System.out.println("CPF: " + c.getDespesasPrevistas().getDespesaMes("março") + " - Saldo: " + c.getSaldo());
        }
    }
}
