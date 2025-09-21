import java.util.Scanner;

public class Questao22{

    public static void A_Z(){
        Scanner input = new Scanner(System.in);
        char L1, L2;

        System.out.println("Digite a letra inicial: ");
            L1 = input.next().toUpperCase().charAt(0);
        System.out.println("Digite a outra letra: ");
            L2 = input.next().toUpperCase().charAt(0);

        if(L1 < 'A' || L1 > 'Z' || L2 < 'A' || L2 > 'Z'){
            System.out.println("Não permitido ");
        } else if(L1 >= L2){
            System.out.println("Não estar em ordem alfabética ");
        } else{
            System.out.printf("Número de caracteres entre eles é: %d", (L2 - L1) - 1);
        }
    }

    public void run(){
        A_Z();
    }
}