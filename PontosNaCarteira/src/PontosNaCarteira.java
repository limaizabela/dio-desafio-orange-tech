import java.util.Scanner; 
    
public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a velocidade do veículo: ");
        int velocidade = leitor.nextInt();
        System.out.println("Informe a quantidade de multas: ");
        int multas = leitor.nextInt();

        /* int contador = 1 + multas;

        if (velocidade > 80 && contador >= 3){
            System.out.println(contador +" multas. Levou pontos na carteira");

        }
        if (velocidade > 80 && contador == 2){
            System.out.println(contador +" multas. Não levou pontos na carteira");

        }
        if (velocidade == 80 && contador >= 1){
            System.out.println(multas +" multa. Não levou pontos na carteira");

        } */
        if(velocidade > 80){
            multas ++;
        }
  
        if(multas > 2){
            System.out.println(multas + " multas. Levou pontos na carteira");
        }else{
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
    
}



