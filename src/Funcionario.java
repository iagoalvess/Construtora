import java.util.List;

public class Funcionario extends Usuario {
    private List<Integer> projetosAutorizados = null;

    public Funcionario(int numeroIdentificacao, String nome, String cpf, String cargo, List<Integer> projetosAutorizados) {
        super(numeroIdentificacao, nome, cpf, cargo);
        this.projetosAutorizados = projetosAutorizados;
    }

    @Override
    public void criarUsuario() {
        System.out.println("Funcionário " + nome + " foi criado.");
    }

    public List<Integer> getProjetosAtutorizados() {

        return projetosAutorizados;
    }

}
