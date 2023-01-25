import java.util.Scanner;

public class DownloadDePacotes { 
    
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Entrada de 1 a 10: ");
            int tamanho = leitor.nextInt();

            switch (tamanho){
                case 1:
                    System.out.print( "/" );
                    break;
                case 2:
                    System.out.print( "//" );
                    break;
                case 3:
                    System.out.print( "///" );
                    break;
                case 4:
                    System.out.print( "////" );
                    break;
                case 5:
                    System.out.print( "/////" );
                    break;
                case 6:
                    System.out.print( "//////" );
                    break;
                case 7:
                    System.out.print( "///////" );
                    break;
                case 8:
                    System.out.print( "////////" );
                    break;
                case 9:
                    System.out.print( "/////////" );
                    break;
                case 10:
                    System.out.print( "//////////" );
                    break;
                default:
                    System.out.println("Número inválido");
                }

            }
        
                //implemantando mesma solução usando o if 
                /* if (tamanho == 1){
                    System.out.print( "/" );
                }else if (tamanho == 2){
                    System.out.print( "//" );
                }else if (tamanho == 3){
                    System.out.print( "///" );
                }
                else if (tamanho == 4){
                    System.out.print( "////" );
                }else if (tamanho == 5){
                    System.out.print( "/////" );
                }else if (tamanho == 6){
                    System.out.print( "//////" );
                }else if (tamanho == 7){
                    System.out.print( "///////" );
                }else if (tamanho == 8){
                    System.out.print( "////////" );
                }else if (tamanho == 9){
                    System.out.print( "/////////" );
                }else if (tamanho == 10){
                    System.out.print( "//////////" );
                }else{
                    System.out.println("Número inválido");
                } */
                    
    
}