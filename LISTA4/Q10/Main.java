package LISTA4.Q10;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho total do download (em bytes): ");
            int tamanho = input.nextInt();

        ITransferencia download = new TransferenciaHTTP();
        download.iniciarDownload(tamanho);
    }
}