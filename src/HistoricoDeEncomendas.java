import java.util.ArrayList;
import java.util.List;

public class HistoricoDeEncomendas {
    private int id;
    private List<Encomenda> encomendas;

    public HistoricoDeEncomendas(int id) {
        this.id = id;
        this.encomendas = new ArrayList<>();
    }

    public void criar(Encomenda encomenda) {
        encomendas.add(encomenda);
        System.out.println("Encomenda adicionada ao histórico: " + encomenda.toString());
    }

    public List<Encomenda> pegarEncomendas() {
        return encomendas;
    }

    public void excluir(Encomenda encomenda) {
        if (encomendas.remove(encomenda)) {
            System.out.println("Encomenda removida do histórico.");
        } else {
            System.out.println("Erro: Encomenda não encontrada no histórico.");
        }
    }
}
