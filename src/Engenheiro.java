import java.util.List;

public class Engenheiro extends Usuario {
    private List<Integer> projetosCoordenados;

    public Engenheiro(int numeroIdentificacao, String nome, String cpf, String cargo, List<Integer> projetosCoordenados) {
        super(numeroIdentificacao, nome, cpf, cargo);
        this.projetosCoordenados = projetosCoordenados;
    }

    @Override
    public void criarUsuario() {
        System.out.println("Engenheiro " + nome + " foi criado.");
    }
}