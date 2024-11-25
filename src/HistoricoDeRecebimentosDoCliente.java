import java.util.ArrayList;
import java.util.List;

public class HistoricoDeRecebimentosDoCliente {
    private int id;
    private List<Recebimento> recebimentos;

    public HistoricoDeRecebimentosDoCliente(int id) {
        this.id = id;
        this.recebimentos = new ArrayList<>();
    }

    public void criar(Recebimento recebimento) {
        recebimentos.add(recebimento);
        System.out.println("Recebimento adicionado ao histórico.");
    }

    public List<Recebimento> pegarRecebimentos() {
        return recebimentos;
    }

    public void excluir() {
        recebimentos.clear();
        System.out.println("Histórico de recebimentos excluído.");
    }
}
