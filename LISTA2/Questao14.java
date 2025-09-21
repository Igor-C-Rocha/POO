import java.util.Scanner;

public class Questao14{

    public static void mairMenor(){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, aux = 0, media = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 10 números: ");
        
        for(int i = 0 ; i < 10; i++){
            aux = input.nextInt();

    if(aux >= 0){
        if(aux != 0){
            if(aux > maior){
            maior = aux;
        }
        if(aux < menor){
            menor = aux;
        }
    }
    } else {
        System.out.println("Número inválido: ");
        i--;
    }
    media += aux;
}

    System.out.printf("""

            O maior número foi: %d
            O menor número foi: %d
            A média dos números foi: %d

            """, maior, menor, media/10);
    }

    public void run(){
        mairMenor();     
    }
}