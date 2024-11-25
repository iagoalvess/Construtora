import java.util.Date;

public class PerfilFuncionario {
    private int numeroIdentificacao;
    private String nome;
    private String cargo;
    private int salario;
    private Date dataContratacao;
    private Date dataDesligamento;
    private StatusFuncionario status;

    public PerfilFuncionario(int numeroIdentificacao, String nome, String cargo, int salario, Date dataContratacao, StatusFuncionario status) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.status = status;
    }

    public void criar() {
        System.out.println("Funcionário criado: " + nome + ", Cargo: " + cargo);
    }

    public void atualizarStatus(StatusFuncionario novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do funcionário " + nome + " atualizado para: " + status);
    }

    public void detalhar() {
        System.out.println("Detalhes do Funcionário:");
        System.out.println("- ID: " + numeroIdentificacao);
        System.out.println("- Nome: " + nome);
        System.out.println("- Cargo: " + cargo);
        System.out.println("- Salário: " + salario);
        System.out.println("- Data de Contratação: " + dataContratacao);
        if (dataDesligamento != null) {
            System.out.println("- Data de Desligamento: " + dataDesligamento);
        }
        System.out.println("- Status: " + status);
    }

    public void excluir() {
        System.out.println("Funcionário excluído: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public StatusFuncionario getStatus() {
        return status;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }
}

enum StatusFuncionario {
    ATIVO, APOSENTADO, DESLIGADO
}