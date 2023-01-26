import java.util.Scanner; 
    
public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de moedas: ");
        int moedas = leitor.nextInt();
        
        int quantidadeDoces = moedas * 2;

        System.out.println("O cliente obteve "+quantidadeDoces+" doces");

    }
}