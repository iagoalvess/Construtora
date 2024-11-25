import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamentos {
    private int id;
    private List<Pagamento> pagamentos;

    public RegistroDePagamentos(int id) {
        this.id = id;
        this.pagamentos = new ArrayList<>();
    }

    public void criar(Pagamento pagamento) {
        pagamentos.add(pagamento);
        System.out.println("Pagamento registrado.");
    }

    public List<Pagamento> detalhar() {
        return pagamentos;
    }

    public void excluir() {
        pagamentos.clear();
        System.out.println("Registro de pagamentos excluído.");
    }
}
