import java.util.Scanner;

public class Questao18{

    public static void mairMenorVetor(){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int [10];
        int separado, aux;

        System.out.println("Informe 10 números inteiros e positivos: ");
    
        for(int i = 0 ; i < 10; i++){
            aux = input.nextInt();
            if(aux < 0){
                System.out.println("Valor inválido ");
                i--;
            } else{
                vetor[i] = aux;
            }
        }
        System.out.println("Informe o número individual: ");
        separado = input.nextInt();

        System.out.printf("Número maior que %d\n", separado);

        boolean maior = false;
        for(int i = 0; i < 10; i++){
            if(vetor[i] > separado){
                System.out.printf(" %d \n", vetor[i]);
            maior = true;
            }
        }
        if(!maior){
            System.out.println("Não tem números maiores ");
        }

        System.out.printf("Número menor que %d\n", separado);

        boolean menor = false;
        for(int i = 0; i < 10; i++){
            if(vetor[i] < separado){
                System.out.printf(" %d \n", vetor[i]);
            menor = true;
            }
        }
        if(!menor){
            System.out.println("Não tem números menores ");
        }

        System.out.printf("Número iguais que %d\n", separado);

        boolean iguais = false;
        for(int i = 0; i < 10; i++){
            if(vetor[i] == separado){
                System.out.printf(" %d \n", vetor[i]);
            iguais = true;
            }
        }
        if(!iguais){
            System.out.println("Não tem números iguais ");
        }        
    }

    public void run(){
        mairMenorVetor();     
    }
}