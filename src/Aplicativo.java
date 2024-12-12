import java.text.ParseException;

public class Aplicativo {
    

  public static void main(String[] args) throws ParseException {
      
    
    Dados data = new Dados("dadosTeste.txt");


    //while infinito para o sistema
   
    Telas paginas = new Telas();
    String pagina = "1";

    Usuario user = null;
    String id_projeto = null;
    Projeto proj = null;
    String id_tarefa = null;

    while (true) {

      switch (pagina) {

          case "1":

            System.out.print("\033\143");

            user = paginas.registar(data);

            if (user == null) { // Verificar se o usuário é válido
              System.out.println("Usuário inválido! Tente novamente.");
              break; // Voltar para o início do case
            }
            
            pagina = "2";
            break;

          case "2":
           
            System.out.print("\033\143");

            id_projeto = paginas.escolherProjeto(user);

            if(id_projeto.equals("v")) {
                pagina = "1";
                break;
            } else if(id_projeto.equals("e")) {
              pagina = "2";
              break;
            }
            
            pagina = "3";
            break;

          case "3":

            System.out.print("\033\143");
      
            for(Projeto p: data.ps) {
           
            	if(p.getId() == Integer.parseInt(id_projeto))
                     proj = p;
             
            }
      
            id_tarefa = paginas.mostrarProjeto(proj);

            if(id_tarefa.equals("v")) {
              pagina = "2";
              break;
            } else if(id_tarefa.equals("e")) {
              pagina = "3";
              break;
            }
            
            pagina = "4";
            break;
          
          case "4":

            System.out.print("\033\143");

            Tarefa tar = null;

            for(Tarefa t: proj.hisTarefas.pegarTarefas()) {

              if(t.getId() == Integer.parseInt(id_tarefa))
                  tar = t;
            }
    
            String valor = paginas.mostarTarefa(tar);

            if(valor.equals("v")) {
              pagina = "3";
              break;
            } else if(valor.equals("e")) {
              pagina = "4";
              break;
            }
            
            
            break;

          default:
              throw new AssertionError();
      }
    }


  }
  
}
