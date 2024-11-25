import java.util.Date;

public class Recebimento {
    private int id;
    private float valor;
    private String nome;
    private Date dataCriacao;
    private Date dataLimite;
    private Date dataPagamentoEfetivado;
    private String descricao;
    private StatusRecebimento status;

    public Recebimento(int id, float valor, String nome, Date dataCriacao, Date dataLimite, String descricao, StatusRecebimento status) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
        this.descricao = descricao;
        this.status = status;
    }

    public void gerarRecebimento() {
        System.out.println("Recebimento gerado: " + nome);
    }

    public void atualizarStatus(StatusRecebimento status) {
        this.status = status;
        System.out.println("Status atualizado para: " + status);
    }

    public void detalharRecebimento() {
        System.out.println("Detalhes do recebimento: " + descricao);
    }

    public void enviarRecebimento() {
        System.out.println("Recebimento enviado.");
    }

    public void excluir() {
        System.out.println("Recebimento excluído.");
    }
}

enum StatusRecebimento {
    EMITIDO, PAGO, FATURADO
}