import java.util.ArrayList;
import java.util.List;

public class CronogramaDeTarefas {
    private int id;
    private List<Tarefa> tarefas;

    public CronogramaDeTarefas(int id) {
        this.id = id;
        this.tarefas = new ArrayList<>();
    }

    public void criar(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada ao cronograma.");
    }

    public List<Tarefa> pegarTarefas() {
        return tarefas;
    }

    public void excluir(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.println("Tarefa do excluída cronograma.");
    }
}
