import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;

public class TesteAplicativo {

    private Dados data;
    private Telas paginas;
    private Usuario user;
    private String id_projeto;
    private Projeto proj;
    private String id_tarefa;

    @Before
    public void setUp() throws ParseException {
        data = new Dados("dadosTeste.txt");
        paginas = new Telas();
    }

    @Test
    public void testeRegistrarUsuarioValido() {
        user = paginas.registar(data);
        assertNotNull("O usuário deve ser válido", user);
        assertEquals("João Silva", user.getNome());
    }

    @Test
    public void testeEscolherProjeto() {
        user = paginas.registar(data);
        String id_projeto = paginas.escolherProjeto(user);
        assertNotEquals("v", id_projeto);
        assertNotEquals("e", id_projeto);
        assertEquals("1", id_projeto);
    }

    @Test
    public void testeMostrarProjeto() {
        user = paginas.registar(data);
        id_projeto = paginas.escolherProjeto(user);

        for (Projeto p : data.ps) {
            if (p.getId() == Integer.parseInt(id_projeto)) {
                proj = p;
                break;
            }
        }

        id_tarefa = paginas.mostrarProjeto(proj);
        assertNotEquals("v", id_tarefa);
        assertNotEquals("e", id_tarefa);
    }

    @Test
    public void testeMostarTarefa() {
        user = paginas.registar(data);
        id_projeto = paginas.escolherProjeto(user);

        for (Projeto p : data.ps) {
            if (p.getId() == Integer.parseInt(id_projeto)) {
                proj = p;
                break;
            }
        }

        id_tarefa = paginas.mostrarProjeto(proj);

        Tarefa tarefa = null;
        for (Tarefa t : proj.hisTarefas.pegarTarefas()) {
            if (t.getId() == Integer.parseInt(id_tarefa)) {
                tarefa = t;
                break;
            }
        }

        assertNotNull("A tarefa deve ser válida", tarefa);
        String valor = paginas.mostarTarefa(tarefa);
        assertNotEquals("v", valor);
        assertNotEquals("e", valor);
    }
}
