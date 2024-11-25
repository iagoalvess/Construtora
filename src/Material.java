public class Material {
    private int id;
    private String nome;
    private String tipo;
    private int quantidade;
    private String descricao;

    public Material(int id, String nome, String tipo, int quantidade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public void registrarCompra(int quantidadeComprada) {
        this.quantidade += quantidadeComprada;
        System.out.println("Compra registrada. Nova quantidade de " + nome + ": " + quantidade);
    }

    public void excluirCompra(int quantidadeRemovida) {
        if (quantidadeRemovida <= quantidade) {
            this.quantidade -= quantidadeRemovida;
            System.out.println("Compra removida. Quantidade restante de " + nome + ": " + quantidade);
        } else {
            System.out.println("Erro: Quantidade a remover é maior que o estoque disponível.");
        }
    }

    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        System.out.println("Quantidade de " + nome + " atualizada para: " + quantidade);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
