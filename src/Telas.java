import java.util.List;
import java.util.Scanner;

public class Telas {
    
    Scanner sc = new Scanner(System.in);

    public Usuario registar(Dados data) {


        System.out.println(("=").repeat(49) + "\n");
        System.out.println((" ").repeat(5) + "APLICATIVO DE GERENCIAMENTO DE PROJETOS" + (" ").repeat(5) + "\n");
        System.out.println(("=").repeat(49));
        System.out.println(("\n").repeat(2));

        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Código de identificação: ");
        String id = sc.nextLine();

        try {
            Usuario u = data.retonarUsuario(id, cpf);
            return u;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String escolherProjetoAuxilar(List<Integer> projetos) {


        for(int p: projetos) {
        
            System.out.print("[" + p + "] ");
          }
  
        System.out.println(("\n").repeat(2));
        
        
        System.out.println("Aperte [v] para voltar");
        System.out.print("Escolha um projeto: ");

        String projetoEscolhido = sc.nextLine();

        if (projetoEscolhido.equals("v"))
          return projetoEscolhido;

        try {
            if (projetos.contains(Integer.parseInt(projetoEscolhido)))
                return projetoEscolhido;
        } catch (NumberFormatException e) {
            projetoEscolhido = "e"; //para o caso de erro
        }

           
        return projetoEscolhido;
    }

    
    public String escolherProjeto(Usuario u) {
        
        Funcionario fu = null;
        Engenheiro en = null;

        String projetoEscolhido = "v";
  
        if (u instanceof Engenheiro eng) {
            en = eng; 
        } else if (u instanceof Funcionario func) {
            fu = func;
        }
  
        System.out.println(("=").repeat(49) + "\n");
        System.out.println((" ").repeat(5) + "APLICATIVO DE GERENCIAMENTO DE PROJETOS" + (" ").repeat(5) + "\n");
        System.out.println(("=").repeat(49));
        System.out.println(("\n").repeat(2));
        
       
        System.out.print("projetos acessíveis: ");
       
        if (fu != null) {
           
            projetoEscolhido = escolherProjetoAuxilar(fu.getProjetosAtutorizados());
                
        }  else if(en != null) {

            projetoEscolhido = escolherProjetoAuxilar(en.getProjetosCoordenados());
        }

        
        return projetoEscolhido;
    }

    public String mostrarProjeto(Projeto p) {

        System.out.println(("=").repeat(49) + "\n");
        System.out.println((" ").repeat(5) + "APLICATIVO DE GERENCIAMENTO DE PROJETOS" + (" ").repeat(5) + "\n");
        System.out.println(("=").repeat(49));
        System.out.println(("\n").repeat(2));
       

        p.retornarRelatorio();

        System.out.println(("\n").repeat(2));
        System.out.println("Aperte [v] para voltar");
        System.out.print("Escolha uma tarefa: ");
        String tarefaEscolhida = sc.nextLine();

        if(tarefaEscolhida.equals("v"))
            return tarefaEscolhida;
        
        for(Tarefa t: p.hisTarefas.pegarTarefas()) {

            try {
                if(t.getId() == Integer.parseInt(tarefaEscolhida))
                return tarefaEscolhida;
            } catch (NumberFormatException e) {
                tarefaEscolhida = "e"; //para o caso de erro
            }

           
        }

        return tarefaEscolhida;
    }

    public String mostarTarefa(Tarefa t) {

        System.out.println(("=").repeat(49) + "\n");
        System.out.println((" ").repeat(5) + "APLICATIVO DE GERENCIAMENTO DE PROJETOS" + (" ").repeat(5) + "\n");
        System.out.println(("=").repeat(49));
        System.out.println(("\n").repeat(2));


        t.detalhar();

        System.out.println(("\n").repeat(2));
        System.out.println("Aperte [v] para voltar");
        String voltar = sc.nextLine();

        if(voltar.equals("v"))
            return voltar;

        return "e";
    }

   
}

