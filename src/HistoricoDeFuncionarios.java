import java.util.ArrayList;
import java.util.List;

public class HistoricoDeFuncionarios {
    private int id;
    private List<PerfilFuncionario> funcionarios;

    public HistoricoDeFuncionarios(int id) {
        this.id = id;
        this.funcionarios = new ArrayList<>();
    }

    public void criar(PerfilFuncionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado ao histórico: " + funcionario.getNome());
    }

    public List<PerfilFuncionario> pegarFuncionarios() {
        return funcionarios;
    }

    public void excluir(PerfilFuncionario funcionario) {
        if (funcionarios.remove(funcionario)) {
            System.out.println("Funcionário removido do histórico: " + funcionario.getNome());
        } else {
            System.out.println("Erro: Funcionário não encontrado no histórico.");
        }
    }
}
