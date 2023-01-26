import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a velocidade atual: ");
        int velocidadeAtual = leitor.nextInt();
        final int velocidadeMaxima = 60;

        if (velocidadeAtual <= velocidadeMaxima){
            System.out.println("Nao foi multado");
        }else{
            System.out.println("Foi multado");
        }
    
    }
}
