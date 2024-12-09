import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dados {


    public List<Projeto> ps;
    public List<Usuario> us;
    public List<Tarefa> ts;

    public Dados (String caminhoArquivo) throws ParseException {
        
        ps = new ArrayList<>();
        us = new ArrayList<>();
        ts = new ArrayList<>();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Path path = Paths.get("dadosTeste.txt");
          
        List<String> linhas = null;
    
        try {
          linhas = Files.readAllLines(path);
    
        } catch (IOException e) {
          // Lida com a exceção, por exemplo, imprime a mensagem de erro
          System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    
        //dados do aplicativo
        
        if (linhas != null) {
            for(String l: linhas) {
    
                String[] dados = l.split(", ");

                switch (dados[0]) {

                    case "p":
                        ps.add(new Projeto(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5], formato.parse(dados[6]), formato.parse(dados[7])));
                        break;
                    case "t":
                        Tarefa t = new Tarefa(Integer.parseInt(dados[1]), dados[2], dados[3], formato.parse(dados[4]), formato.parse(dados[5]), dados[6], dados[7], null);
                        ps.get(ps.size() - 1).hisTarefas.adicionarTarefa(t);
                        ts.add(t);
                        break;
                    case "e":   
                        List<Integer> listaInteiros1 = Arrays.stream(Arrays.copyOfRange(dados, 5, dados.length)) 
                        .map(Integer::parseInt)   
                        .collect(Collectors.toList());
                        us.add(new Engenheiro(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], listaInteiros1));
                        break;
                    case "f": 
                        List<Integer> listaInteiros = Arrays.stream(Arrays.copyOfRange(dados, 5, dados.length)) 
                        .map(Integer::parseInt)   
                        .collect(Collectors.toList());
                        us.add(new Funcionario(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], listaInteiros));
                        break;
                    case "pf":
                        ts.get(ts.size() - 1).adicionarFuncionario(new PerfilFuncionario(Integer.parseInt(dados[1]), dados[2], dados[3], Integer.parseInt(dados[4]), formato.parse(dados[5])));
                        break;
                    default:
                        break;
                }
            }
        }
    }


    public Usuario retonarUsuario(String id, String cpf) {

        Usuario u_retornado = null;

        for(Usuario u: us) {

            if(u.validarUsuario(Integer.parseInt(id), cpf)) {
                u_retornado = u;
            } 
        }

        return u_retornado;    
    }


}
