package LISTA3.Q10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<TRANSPORTE> carro = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar transporte
        2 - Consultar informações
        3 - Listar todos os trnasportes
        4 - Calcular consumo
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe a capacidade: ");
                        int capacidade = input.nextInt();

                    System.out.println("Informe a velocidae maxima: ");
                        int velocidadeMax = input.nextInt();

                    System.out.println("Informe o consumo: ");
                        double consumo = input.nextDouble();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo do transporte: \n(1 - Onibus, 2 - Metro)");
                        int tipo = input.nextInt();
                if(tipo == 1){

                    System.out.println("Informe o número de eixos: ");
                        int numEixos = input.nextInt();

                    ONIBUS eletrons = new ONIBUS(capacidade, velocidadeMax, consumo, preco, numEixos);
                    carro.add(eletrons);
                } else if(tipo == 2){
                    
                    String tipoStr = "Metro";

                    METRO eletrons = new METRO(capacidade, velocidadeMax, consumo, preco, tipoStr);
                    carro.add(eletrons);
                } else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:

                for(int i = 0; i < carro.size(); i++){
                    System.out.println("Transporte " + (i + 1) + ": ");
                    System.out.println(carro.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o número do transporte que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= carro.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    TRANSPORTE c = carro.get(index);

                    double desconto = c.calcularDesconto();
                    System.out.println("Valor original: " + c.preco);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.preco - desconto));
                }
                break;
            case 3:

                for(int i = 0; i < carro.size(); i++){
                    System.out.println("Transporte " + (i + 1) + ": ");
                    System.out.println(carro.get(i).exibirInformacoesOnibus());
                    System.out.println();
                }

                for(int i = 0; i < carro.size(); i++){
                    System.out.println("Transporte " + (i + 1) + ": ");
                    System.out.println(carro.get(i).exibirInformacoesMetro());
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Informe o número do transporte que deseja calcular o consumo: ");
                    int numeroConsumo = input.nextInt();
                    int indexConsumo = numeroConsumo - 1;
                if(indexConsumo < 0 || indexConsumo >= carro.size()){
                    System.out.println("Índice inválido!");
                } else{
                    TRANSPORTE c = carro.get(indexConsumo);

                    System.out.println("Informe a distância: ");
                        double distancia = input.nextDouble();

                    double valorConsumo = c.calcularconsumo(distancia);
                    System.out.println("Valor do consumo para a distância de " + distancia + "\nkm: R$ " + valorConsumo);
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