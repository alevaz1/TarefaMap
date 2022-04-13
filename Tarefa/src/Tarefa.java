import java.util.*;
import java.util.Map.Entry;
public class Tarefa {
    
    public static void main(String args[]){
        exemploListaSimples();

    }

    private static void exemploListaSimples(){
        System.out.println("Pessoas do sexo masculino: ");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "André Santos");
        lista.put(2, "Bruno Alves");
        lista.put(3, "Carlos Santos");
        lista.put(4, "Fernando Silva");

        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Número: " + entry1.getKey());
            System.out.println("Nome: " + entry1.getValue());

            
        }

        System.out.println("Pessoas do sexo feminino: ");
        Map<Integer, String> lista2 = new HashMap<>();
        lista2.put(1, "Andreia Santos");
        lista2.put(2, "Bruna Alves");
        lista2.put(3, "Fernanda Santos");
        lista2.put(4, "Julia Andrade");

        Iterator<Map.Entry<Integer, String>> it2 = lista2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> entry2 = it2.next();
            System.out.println("Número: " + entry2.getKey());
            System.out.println("Nome: " + entry2.getValue());
    
       }     
        }
         }
    
