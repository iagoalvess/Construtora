public class SistemaExterno {
    private int id;
    private String nome;
    private String tipo;
    private String empresa;
    private String descricao;
    private StatusSistema status;

    public SistemaExterno(int id, String nome, String tipo, String empresa, String descricao, StatusSistema status) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.empresa = empresa;
        this.descricao = descricao;
        this.status = status;
    }

    public void criar() {
        System.out.println("Sistema Externo criado: " + nome);
    }

    public void atualizarStatus(StatusSistema novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do sistema externo atualizado para: " + novoStatus);
    }

    public void detalhar() {
        System.out.println("Detalhes do Sistema Externo:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
    }

    public void excluir() {
        System.out.println("Sistema Externo excluído: " + nome);
    }

    public String getNome() {
        return this.nome;
    }
}

enum StatusSistema {
    INTEGRADO, DISPONIVEL, INDISPONIVEL
}
