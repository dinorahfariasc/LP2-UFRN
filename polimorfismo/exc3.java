import java.util.ArrayList;

class ItemOrcamento {
    private String historico; 
    private float valor;     

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }
}

class ItemOrcamentoComplexo extends ItemOrcamento {
    private ArrayList<ItemOrcamento> subitens;

    public ItemOrcamentoComplexo(String historico, float valor, ArrayList<ItemOrcamento> subitens) {
        super(historico, valor);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float total = super.getValor();
        for (ItemOrcamento item : subitens) {
            total += item.getValor();
        }
        return total;
    }

    public ItemOrcamento encontraItem(String historico) {
        for (ItemOrcamento item : subitens) {
            if (item.getHistorico().equals(historico)) {
                return item;
            }
        }
        return null;
    }
}

public class exc3 {
    public static void main(String[] args) {
        ItemOrcamento item1 = new ItemOrcamento("material de construcao", 800);
        ItemOrcamento item2 = new ItemOrcamento("mao de obra", 3000);
        ItemOrcamento item3 = new ItemOrcamento("impostos", 200);

        ArrayList<ItemOrcamento> subitens = new ArrayList<>();
        subitens.add(item1);
        subitens.add(item2);
        subitens.add(item3);

        ItemOrcamentoComplexo itemComplexo = new ItemOrcamentoComplexo("projeto completo", 100, subitens);
        System.out.println("valor total do item complexo: " + itemComplexo.getValor());
        ItemOrcamento encontrado = itemComplexo.encontraItem("mao de obra");
        if (encontrado != null) {
            System.out.println("item encontrado: " + encontrado.getHistorico() + " - valor: " + encontrado.getValor());
        } else {
            System.out.println("item não encontrado.");
        }

        ItemOrcamento naoEncontrado = itemComplexo.encontraItem("transporte");
        if (naoEncontrado != null) {
            System.out.println("item encontrado: " + naoEncontrado.getHistorico() + ", valor: " + naoEncontrado.getValor());
        } else {
            System.out.println("item nao encontrado.");
        }
    }
}
