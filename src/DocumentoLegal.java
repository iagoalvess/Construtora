import java.util.Date;

public class DocumentoLegal {
    private int id;
    private String nome;
    private String instituicaoVinculada;
    private Date dataExpedido;
    private Date dataVencimento;
    private String descricao;
    private StatusDocumento status;

    public DocumentoLegal(int id, String nome, String instituicaoVinculada, Date dataExpedido, Date dataVencimento, String descricao, StatusDocumento status) {
        this.id = id;
        this.nome = nome;
        this.instituicaoVinculada = instituicaoVinculada;
        this.dataExpedido = dataExpedido;
        this.dataVencimento = dataVencimento;
        this.descricao = descricao;
        this.status = status;
    }

    public void criar() {
        System.out.println("Documento legal criado: " + nome);
    }

    public void atualizarStatus(StatusDocumento novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do documento atualizado para: " + novoStatus);
    }

    public void detalhar() {
        System.out.println("Detalhes do Documento Legal:");
        System.out.println("- ID: " + id);
        System.out.println("- Nome: " + nome);
        System.out.println("- Instituição Vinculada: " + instituicaoVinculada);
        System.out.println("- Data Expedido: " + dataExpedido);
        System.out.println("- Data de Vencimento: " + dataVencimento);
        System.out.println("- Descrição: " + descricao);
        System.out.println("- Status: " + status);
    }

    public void excluir() {
        System.out.println("Documento legal excluído: " + nome);
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataVencimento() {
        return this.dataVencimento;
    }
}

enum StatusDocumento {
    EM_VIGOR, EXPIRADO
}