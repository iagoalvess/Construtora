import java.util.Date;
import java.util.List;

public class Encomenda {
    private int id;
    private String fornecedor;
    private float valor;
    private Date dataEntrega;
    private String descricao;
    private StatusEncomenda status;
    private List<Material> materiais;

    public Encomenda(int id, String fornecedor, float valor, Date dataEntrega, String descricao, StatusEncomenda status, List<Material> materiais) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.dataEntrega = dataEntrega;
        this.descricao = descricao;
        this.status = status;
        this.materiais = materiais;
    }

    public void gerarEncomenda() {
        System.out.println("Encomenda gerada para o fornecedor: " + fornecedor);
    }

    public void atualizarStatus(StatusEncomenda novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da encomenda atualizado para: " + status);
    }

    public void detalharEncomenda() {
        System.out.println("Detalhes da encomenda:");
        System.out.println("- ID: " + id);
        System.out.println("- Fornecedor: " + fornecedor);
        System.out.println("- Valor: " + valor);
        System.out.println("- Data de Entrega: " + dataEntrega);
        System.out.println("- Descrição: " + descricao);
        System.out.println("- Status: " + status);
        System.out.println("- Materiais:");
        for (Material material : materiais) {
            System.out.println("  - " + material.getNome() + " (Quantidade: " + material.getQuantidade() + ")");
        }
    }

    public void excluir() {
        System.out.println("Encomenda excluída.");
    }
}

enum StatusEncomenda {
    ENTREGUE, EM_ESPERA
}