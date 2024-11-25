import java.util.Date;

public class Pagamento {
    private int id;
    private float valor;
    private String tipo;
    private StatusPagamento status;
    private Date dataLancamento;
    private Date dataEfetivacao;

    public Pagamento(int id, float valor, String tipo, StatusPagamento status, Date dataLancamento, Date dataEfetivacao) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.status = status;
        this.dataLancamento = dataLancamento;
        this.dataEfetivacao = dataEfetivacao;
    }

    public void criar() {
        System.out.println("Pagamento criado.");
    }

    public void atualizarStatus(StatusPagamento status) {
        this.status = status;
        System.out.println("Status do pagamento atualizado.");
    }

    public void detalhar() {
        System.out.println("Detalhes do pagamento.");
    }

    public void excluir() {
        System.out.println("Pagamento excluído.");
    }
}

enum StatusPagamento {
    EMITIDO, PAGO, FATURADO
}