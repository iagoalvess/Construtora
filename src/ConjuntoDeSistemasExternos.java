import java.util.ArrayList;
import java.util.List;

public class ConjuntoDeSistemasExternos {
    private int id;
    private List<SistemaExterno> sistemasIntegrados;
    private List<SistemaExterno> sistemasDisponiveis;

    public ConjuntoDeSistemasExternos(int id) {
        this.id = id;
        this.sistemasIntegrados = new ArrayList<>();
        this.sistemasDisponiveis = new ArrayList<>();
    }

    public void criar(SistemaExterno sistema) {
        sistemasDisponiveis.add(sistema);
        System.out.println("Sistema adicionado como disponível: " + sistema.getNome());
    }

    public void integrarSistema(SistemaExterno sistema) {
        if (sistemasDisponiveis.contains(sistema)) {
            sistemasDisponiveis.remove(sistema);
            sistemasIntegrados.add(sistema);
            System.out.println("Sistema integrado: " + sistema.getNome());
        } else {
            System.out.println("Sistema não está disponível para integração.");
        }
    }

    public void pegarSistemas() {
        System.out.println("Sistemas Integrados:");
        for (SistemaExterno sistema : sistemasIntegrados) {
            System.out.println("- " + sistema.getNome());
        }

        System.out.println("Sistemas Disponíveis:");
        for (SistemaExterno sistema : sistemasDisponiveis) {
            System.out.println("- " + sistema.getNome());
        }
    }

    public void excluirSistema(SistemaExterno sistema) {
        if (sistemasIntegrados.remove(sistema) || sistemasDisponiveis.remove(sistema)) {
            System.out.println("Sistema removido: " + sistema.getNome());
        } else {
            System.out.println("Sistema não encontrado.");
        }
    }
}
