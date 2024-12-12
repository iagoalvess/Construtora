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
    public CronogramaDeTarefas hisTarefas;

    public Projeto(int id, String nome, String nomeGestor, String tipo, String localidade, Date dataInicio, Date dataFim) {
        this.id = id;
        this.nome = nome;
        this.nomeGestor = nomeGestor;
        this.tipo = tipo;
        this.localidade = localidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = Status.EM_ANDAMENTO;

        hisTarefas = new CronogramaDeTarefas(1);
    }

    public void atualizarProjeto() {
        
        
    }

    public int getId() {

        return this.id;
    }

    public void retornarRelatorio() {
        
        //dados projeto
        System.out.println("Nome:" + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Gestor:" + this.nomeGestor);
        System.out.println("Status: " + this.status);
        System.out.println("Localidade: " + this.localidade);
        System.out.println("Data de início: " + this.dataInicio);
        System.out.println("Data limite: " + this.dataFim + "\n");

        //tarefas
        System.out.println("Taferas:");

        for(Tarefa t: hisTarefas.pegarTarefas()) {
            
            System.out.println("+++++++++++++++++++++");
            t.detalhar_curto();
        }

        System.out.println("\n");
    }
}

enum Status {
    PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
}
