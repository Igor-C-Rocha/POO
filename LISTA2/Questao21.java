import java.util.Scanner;
import java.util.Random;

public class Questao21{

    public static void randomico(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int aleatorio = rand.nextInt(1, 101);
        int chute, tentativas = 0;

        System.out.println("Adivinha o número entre 1 a 100 ");

        do{
            chute = input.nextInt();
            tentativas++;
            if(chute < aleatorio){
                System.out.println("Chute mais alto ");
            } else if(chute > aleatorio){
                System.out.println("Chute mais baixo ");
            } else{
                System.out.printf("""
                    
                    O número era: %d
                    Tentativas: %d
                    :D
                    """, aleatorio, tentativas);
            }
        }while(aleatorio != chute);
    }

    public void run(){
        randomico();
    }
}