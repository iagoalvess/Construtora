import java.util.Date;

public class Projeto {
    private int id;
    private String nome;
    private String nomeGestor;
    private String tipo;
    private String localidade;
    private Date dataInicio;
    private Date dataFim;
    private Status status;

    public Projeto(int id, String nome, String nomeGestor, String tipo, String localidade, Date dataInicio, Date dataFim, Status status) {
        this.id = id;
        this.nome = nome;
        this.nomeGestor = nomeGestor;
        this.tipo = tipo;
        this.localidade = localidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public void criarProjeto() {
        System.out.println("Projeto criado: " + nome);
    }

    public void atualizarProjeto(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
        System.out.println("Projeto atualizado.");
    }

    public void retornarRelatorio() {
        System.out.println("Relatório do projeto: " + nome);
    }

    public void excluirProjeto() {
        System.out.println("Projeto excluído: " + nome);
    }
}

enum Status {
    PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
}
