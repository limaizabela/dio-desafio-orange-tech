import java.util.Scanner; 
    
public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de páginas do livro: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int dias = paginas / paginasLidas;

        System.out.println(dias + " dias");
    }

}