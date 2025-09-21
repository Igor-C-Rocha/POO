import java.util.Scanner;

public class Questao19{

    public static void modelos(){

    int tamanho = 3;
    int[] idade = new int[tamanho];
    String[] nome = new String[tamanho];
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < tamanho; i++){
        System.out.printf("Digite o nome da menina %d: ", i + 1);
            nome[i] = input.nextLine();

        System.out.printf("Digite a idade da %s: \n", nome[i]);
            idade[i] = input.nextInt();
            input.nextLine();
    }
    System.out.println("Estão aptas a ser modelos: ");
    boolean apta = false;

    for(int i = 0; i < 10; i++){
        if(idade[i] >= 18 && idade[i] <= 20){
            System.out.printf("""
                Nome: %s
                Idade: %d

                    """, nome[i], idade[i]);
            apta = true;
            }
        }
        if(!apta){
            System.out.println("Nenhuma menina está apta ");
        }
    }

    public void run(){
        modelos();
    }
}