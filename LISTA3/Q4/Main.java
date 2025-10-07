package LISTA3.Q4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<IMOVEL> AP = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar lugar pra alugar
        2 - Consultar taxas e informações
        3 - Listar todos os APs
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o endereço: ");
                        String endereco = input.nextLine();

                    System.out.println("Informe a aréa: ");
                        String area = input.nextLine();

                    System.out.println("Informe o número de quartos: ");
                        double numeroQuartos = input.nextDouble();

                input.nextLine();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo do AP: \n(1 - Apartamento, 2 - Casa)");
                        int tipo = input.nextInt();
                if(tipo == 1){

                    String tipoStr = "Apartamento";
                    APARTAMENTO apartamento = new APARTAMENTO(endereco, area, numeroQuartos, preco, tipoStr);
                    AP.add(apartamento);
                } else if(tipo == 2){
                    
                    String tipoStr = "Casa";
                    CASA casa = new CASA(endereco, area, numeroQuartos, preco, tipoStr);
                    AP.add(casa);
                } else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:

                for(int i = 0; i < AP.size(); i++){
                    System.out.println("Aps " + (i + 1) + ": ");
                    System.out.println(AP.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o imovel que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= AP.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    IMOVEL c = AP.get(index);

                    double desconto = c.calcularTaxa();
                    System.out.println("Valor original: " + c.preco);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.preco - desconto));
                }
                break;
            case 3:

                System.out.println("Lista de APs: ");
                for(int i = 0; i < AP.size(); i++){
                    System.out.println("Aps " + (i + 1) + ": ");
                    System.out.println(AP.get(i).exibirInformacoes());
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