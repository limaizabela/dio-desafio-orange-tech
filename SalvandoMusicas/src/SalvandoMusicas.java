// - O método .contains() verificar se em uma determinada String tem um determinado caractere ou um conjunto deles

import java.util.Scanner; 
    
public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do arquivo: ");
        String arquivoDoPc = leitor.next();
        String mp3 = ".mp3";

        boolean verificacao = arquivoDoPc.contains(mp3);

        if (verificacao == true){
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }

    }
}