package LISTA4.Q1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{

public static void main(String[] agrs){
    Scanner input = new Scanner(System.in);
    List<Fatura> compra = new ArrayList<>();
    int opcao, aux = 0;

    do{
        System.out.printf("""

                1 - ADD
                2 - EXIBIR
                0 - SAIR
                
                """);
        opcao = input.nextInt();
    
    switch (opcao){
        case 1:
            System.out.println("Quantos valores quer incrementar: ");
                aux = input.nextInt();
            for(int i = 0; i < aux; i++){
                Fatura F = new Fatura(i);
                compra.add(F);
            }
            break;
        case 2:

        if(aux > 5){
            System.out.println("Rascunho da lista\n");
                for(int i = 0; i < compra.size(); i++){
                    System.out.println(compra.get(i).exibirRascunho());
                }
            } else if(aux <= 0){
                System.out.println("Lista vazia");
            } else{
            System.out.println("Lista alta resolução\n");
                for(int i = 0; i < compra.size(); i++){
                    System.out.println(compra.get(i).exibirAlta());
                    }
                }
            break;
        case 0:
            System.out.println("Saindo...");
            break;
        default:
            System.out.println("Invalido");
            break;
        }
    } while(opcao != 0);
}
}