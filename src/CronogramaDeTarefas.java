import java.util.ArrayList;
import java.util.List;

public class CronogramaDeTarefas {
    private int id;
    private List<Tarefa> tarefas;

    public CronogramaDeTarefas(int id) {
        this.id = id;
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> pegarTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa t) {

        tarefas.add(t);
    }

    public void excluirTarefa(Tarefa t) {

        tarefas.remove(t);
    }

}
