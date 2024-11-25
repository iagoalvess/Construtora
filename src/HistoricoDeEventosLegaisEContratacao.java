import java.util.ArrayList;
import java.util.List;

public class HistoricoDeEventosLegaisEContratacao {
    private int id;
    private List<DocumentoLegal> documentos;

    public HistoricoDeEventosLegaisEContratacao(int id) {
        this.id = id;
        this.documentos = new ArrayList<>();
    }

    public void criar(DocumentoLegal documento) {
        documentos.add(documento);
        System.out.println("Documento legal adicionado ao histórico: " + documento.getNome());
    }

    public List<DocumentoLegal> pegarDocumentos() {
        return documentos;
    }

    public void retornarAgenda() {
        System.out.println("Agenda de Documentos Legais:");
        for (DocumentoLegal documento : documentos) {
            System.out.println("- Documento: " + documento.getNome() + ", Vencimento: " + documento.getDataVencimento());
        }
    }

    public void excluir(DocumentoLegal documento) {
        if (documentos.remove(documento)) {
            System.out.println("Documento removido do histórico: " + documento.getNome());
        } else {
            System.out.println("Erro: Documento não encontrado no histórico.");
        }
    }
}
