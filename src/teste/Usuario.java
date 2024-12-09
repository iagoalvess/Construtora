public abstract class Usuario {
    protected int numeroIdentificacao;
    protected String nome;
    protected String cpf;
    protected String cargo;

    public Usuario(int numeroIdentificacao, String nome, String cpf, String cargo) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public boolean validarUsuario(int id, String cpf) {
        
        return this.cpf.equals(cpf) && this.numeroIdentificacao == id;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void visualizarProjeto() {
        System.out.println(nome + " está visualizando projetos.");
    }

    public abstract void criarUsuario();

    public void excluirUsuario() {
        System.out.println("Usuário " + nome + " foi excluído.");
    }
}
