import java.util.Scanner; 
    
public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o tamanho da fila: ");
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        for(int i=0; i <= tamanhoDaFila; i++){
            if(i%2 != 0){
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote+" pessoas no camarote");


    }

}