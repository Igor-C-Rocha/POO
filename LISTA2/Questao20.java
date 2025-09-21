import java.util.Scanner;

public class Questao20{

    public static void posicoes(){
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int [50];
        int[] vetor2 = new int [50];
        int posicao = 0;

        System.out.println("Informe 50 números inteiros ");
    
        for(int i = 0 ; i < 50; i++){
            System.out.printf("1° vetor, posição [%d]: ", i);
            vetor1[i] = input.nextInt();

            System.out.printf("2° vetor, posição [%d]: ", i);
            vetor2[i] = input.nextInt();
                
        if(vetor1[i] == vetor2[i]){
            posicao++;
        }
        }
        System.out.printf("Tem %d números idênticos na mesma posição ", posicao);
    }

    public void run(){
        posicoes();
    }
}