
import java.util.Scanner; 
    
public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe os ingredientes: ");
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        listaIngredientes = ingredientes.split(";");
 
        for(String itens : listaIngredientes){
            System.out.println(itens);
        }
    }
}