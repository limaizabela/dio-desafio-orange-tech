import java.util.Scanner; 
    
public class MesadaSobrinho {
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de meses: ");
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int dinheiro = entrada * mesada;

        System.out.println("O valor obtido é: " + dinheiro);
    }

}