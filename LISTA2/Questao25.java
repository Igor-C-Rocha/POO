import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Questao25{

    public void ListaImpar(List<Integer> vetor){

        for(Integer valor : vetor){
            if(valor % 2 != 0){
                System.out.println(valor);
            }
        }
    }
    
    public void ListaPar(List<Integer> vetor){

        for(Integer valor : vetor){
            if(valor % 2 == 0){
                System.out.println(valor);
            }
        }
    }
    
    public void listaImparnoPar(List<Integer> vetor){
        int Par = 0, Impar = 0;
        
        for(int i = 0; i < vetor.size(); i++){
            if(i % 2 == 0 && vetor.get(i) % 2 != 0){
                Impar++;
            } else if(i % 2 != 0 && vetor.get(i) % 2 == 0){
                Par++;
            }
        }
        System.out.printf("Quantidade de números ímpares nas posições pares: %d\n", Impar);
    }

    public void listaParnoImpar(List<Integer> vetor){
        int Par = 0, Impar = 0;
        
        for(int i = 0; i < vetor.size(); i++){
            if(i % 2 != 0 && vetor.get(i) % 2 == 0){
                Par++;
            } else if(i % 2 == 0 && vetor.get(i) % 2 != 0){
                Impar++;
            }
        }
        System.out.printf("Quantidade de números pares nas posições ímpares: %d\n", Par);
    }

    public List<Integer> carregarVetor(){
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        int quantidade;

        System.out.println("Quantos números deseja inserir: ");
            quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %dº número: \n", i + 1);
                vetor.add(input.nextInt());
        }
        return vetor;
    }

    public void menu(){
        List<Integer> vetor = new ArrayList<>();
        int opcao;
        Scanner input = new Scanner(System.in);

    do{

    System.out.print("""
        ---MENU---

        1 - Carregar Vetor
        2 - Listar Vetor
        3 - Exibir apenas os números pares
        4 - Exibir apenas os números ímpares
        5 - Exibir quantidade de números pares existem nas posições ímpares
        6 - Exibir quantidade de números ímpares existem nas posições pares
        0 - Sair

        """);
    opcao = input.nextInt();

    if(opcao > 6 || opcao < 0){
        System.out.println("Opção Inválida ");
    } else {
        if(opcao == 0){
            System.out.println("Saindo ...");
            break;
        }
        switch(opcao){
            case 1:
                vetor = carregarVetor();
            break;
            case 2:
                System.out.println("Lista vetor: ");
                System.out.println(vetor);
            break;
            case 3:
                System.out.println("Pares: ");
                ListaPar(vetor);
            break;
            case 4:
                System.out.println("Ímpares: ");
                ListaImpar(vetor);
            break;
            case 5:
                listaParnoImpar(vetor);
                break;
            case 6:
                listaImparnoPar(vetor);
            break;
        }
      }
    }while(true);
}

    public void run(){
        menu();
    }
}