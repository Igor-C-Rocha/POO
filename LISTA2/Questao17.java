import java.util.Scanner;

public class Questao17{

    public static int[] doisvetores(Scanner input, String nome){

    int tamanho;
    System.out.printf("Informe o tamanho do vetor %s: ", nome);
    tamanho = input.nextInt();

    int[] vetor = new int[tamanho];

    for(int i = 0; i < tamanho; i++){
        System.out.printf("""

            Digite o valor da posição %d do vetor %s:
            """, i, nome);
        vetor[i] = input.nextInt();
    }
    return vetor;
   }

   public static int escalar(int[] UVetor, int[] DVetor){
        int escalar = 0;
    
    if(UVetor.length != DVetor.length){
        System.out.println("Os vetores tem que ter o mesmo tamanho ");
            return -1;
        }

    for (int i = 0; i < UVetor.length; i++) {
        escalar += UVetor[i] * DVetor[i];
    }
    return escalar;
   }

    public void run(){
        Scanner input = new Scanner(System.in);
        
        int[] UVetor = doisvetores(input, "U");
        int[] DVetor = doisvetores(input, "D");

        int resultado = escalar(UVetor, DVetor);

        if(resultado != -1){
            System.out.printf("Resultado: %d\n", resultado);
        }
    }
}