package LISTA3.Q8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<PRATO> fome = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar uma prato
        2 - Consultar informações
        3 - Listar incredientes
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o nome do prato: ");
                        String nome = input.nextLine();

                    System.out.println("Informe o tempo de prepraro: ");
                        double tempoPreparo = input.nextDouble();

                input.nextLine();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo da comida: \n(1 - Vegano, 2 - Gourmet)");
                        int tipo = input.nextInt();
                    input.nextLine();

                    System.out.println("Informe os ingredientes separados por vírgula:");

                    String ingredientesInput = input.nextLine();
                    String[] ingredientesArray = ingredientesInput.split(",");

                    PRATO prato;

                    if (tipo == 1){
                        prato = new VEGANO(nome, tempoPreparo, preco, "Vegano");
                    } else if(tipo == 2){
                        prato = new GOURMET(nome, tempoPreparo, preco, "Gourmet");
                    } else{
                        System.out.println("Tipo inválido!");
                        break;
                    }

                    for (String ingrediente : ingredientesArray){
                        prato.adicionarIngrediente(ingrediente.trim());
                    }

                    fome.add(prato);
                break;
            case 2:

                for(int i = 0; i < fome.size(); i++){
                    System.out.println("Prato " + (i + 1) + ": ");
                    System.out.println(fome.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o número dp prato que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= fome.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    PRATO c = fome.get(index);

                    double desconto = c.calcularServico();
                    System.out.println("Valor original: " + c.preco);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.preco - desconto));
                }
                break;
            case 3:
            
                for(int i = 0; i < fome.size(); i++){
                    System.out.println("Prato " + (i + 1) + ": ");
                    System.out.println(fome.get(i).exibirListaDeIngredientes(fome.get(i).ingredientes));
                    System.out.println();
                }
                break;
            case 0:

                System.out.println("Saindo...");
                break;
            default:

                System.out.println("Opção inválida!");
                break;
        }
    } while(opcao != 0);
  }
}