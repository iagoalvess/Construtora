import java.util.Date;
import java.util.List;

public class Tarefa {
    private int id;
    private String tipo;
    private String nome;
    private Date dataInicio;
    private Date dataLimite;
    private String descricao;
    private StatusTarefa status;
    private String local;
    private List<PerfilFuncionario> funcionarios;

    public Tarefa(int id, String tipo, String nome, Date dataInicio, Date dataLimite, String descricao, StatusTarefa status, String local, List<PerfilFuncionario> funcionarios) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataLimite = dataLimite;
        this.descricao = descricao;
        this.status = status;
        this.local = local;
        this.funcionarios = funcionarios;
    }

    public void criar() {
        System.out.println("Tarefa criada: " + nome);
    }

    public void atualizarStatus(StatusTarefa status) {
        this.status = status;
        System.out.println("Status da tarefa atualizado para: " + status);
    }

    public void detalhar() {
        System.out.println("Detalhes da tarefa: " + descricao);
    }

    public void excluir() {
        System.out.println("Tarefa excluída.");
    }
}

enum StatusTarefa {
    EM_ANDAMENTO, FINALIZADA, CANCELADA
}