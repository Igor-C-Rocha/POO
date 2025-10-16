package LISTA4.Q6;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Logger logger = new Logger();

        System.out.print("Digite uma mensagem de log: ");
            String mensagem = input.nextLine();

        System.out.println("\nSalvando log localmente...");
            logger.salvarLocal(mensagem);

        System.out.println("\nSalvando log remotamente...");
            logger.salvarRemoto(mensagem);
    }
}