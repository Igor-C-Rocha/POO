import java.util.Scanner;

public class Questao16{

    public static void vetor(){
        int[] vetor = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 10 números: ");

    for(int i = 0; i < 10; i++){
        vetor[i] = input.nextInt();
    }
    for(int i = 9; i >= 0; i--){
        System.out.printf(" %d ", vetor[i]);
    }
}

    public void run(){
        vetor();
    }
}