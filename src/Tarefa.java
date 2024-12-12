import java.util.ArrayList;
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

    public Tarefa(int id, String tipo, String nome, Date dataInicio, Date dataLimite, String descricao, String local, List<PerfilFuncionario> funcionarios) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataLimite = dataLimite;
        this.descricao = descricao;
        this.status = StatusTarefa.EM_ANDAMENTO;
        this.local = local;
        this.funcionarios = funcionarios;
    }

    public void atualizarStatus(StatusTarefa status) {
        this.status = status;
        System.out.println("Status da tarefa atualizado para: " + status);
    }

    public void adicionarFuncionario(PerfilFuncionario pf) {

        if(this.funcionarios == null) {

            this.funcionarios = new ArrayList<>();
        } else {

            funcionarios.add(pf);
        }
    }

    public void detalhar() {

        System.out.println("nome: " + this.nome);
        System.out.println("tipo: " + this.tipo);
        System.out.println("Local: " + this.local);
        System.out.println("Status: " + this.status + "\n");

        System.out.println("Data de início: " + this.dataInicio);
        System.out.println("Data de termino: " + this.dataLimite + "\n");

        System.out.println("Descrição: " + this.descricao + "\n");


        System.out.println("Funcionários:");

        for(int i = 0; i < this.funcionarios.size(); i++) {

            System.out.println(funcionarios.get(i).getNome());

        }
    }

    public void detalhar_curto() {
        
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Status: " + this.status);
    }

    public int getId() {

        return this.id;
    }


}

enum StatusTarefa {
    EM_ANDAMENTO, FINALIZADA, CANCELADA
}
