import java.util.Scanner;

public class Questao12{

    public static void mairMenor(){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, aux = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os números: ");
        
        do{
            aux = input.nextInt();

        if(aux != 0){
            if(aux > maior){
            maior = aux;
        }
        if(aux < menor){
            menor = aux;
        }
    }
        }while(aux != 0);

    System.out.printf("""

            O maior número foi: %d
            O menor número foi: %d

            """, maior, menor);
    }

    public void run(){
        mairMenor();     
    }
}