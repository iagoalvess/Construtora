import java.util.ArrayList;
import java.util.List;

public class HistoricoDeMateriais {
    private int id;
    private List<Material> materiais;

    public HistoricoDeMateriais(int id) {
        this.id = id;
        this.materiais = new ArrayList<>();
    }

    public void criar(Material material) {
        materiais.add(material);
        System.out.println("Material adicionado ao histórico: " + material.getNome());
    }

    public List<Material> pegarMateriais() {
        return materiais;
    }

    public void excluir(Material material) {
        if (materiais.remove(material)) {
            System.out.println("Material removido do histórico: " + material.getNome());
        } else {
            System.out.println("Erro: Material não encontrado no histórico.");
        }
    }
}
