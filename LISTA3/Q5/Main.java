package LISTA3.Q5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<PRODUTOELETRONICO> aparelho = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar um aparelho
        2 - Consultar informações
        3 - Listar todos os aparelhos
        4 - Listar todos os celulares
        5 - Listar todos os notebooks
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o modelo: ");
                        String modelo = input.nextLine();

                    System.out.println("Informe a marca: ");
                        String marca = input.nextLine();

                    System.out.println("Informe a voltagem: ");
                        double voltagem = input.nextDouble();

                input.nextLine();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo do aparelho: \n(1 - Smartphone, 2 - Notebook)");
                        int tipo = input.nextInt();
                if(tipo == 1){

                    String tipoStr = "Smartphone";

                    System.out.println("Informe o tamanho da tela: ");
                        double tamanhoTela = input.nextDouble();
                    System.out.println("Informe a capacidade da bateria: ");
                        int capacidadeBateria = input.nextInt();

                    CELULAR eletrons = new CELULAR(modelo, marca, voltagem, preco, tipoStr, tamanhoTela, capacidadeBateria);
                    aparelho.add(eletrons);
                } else if(tipo == 2){
                    
                    String tipoStr = "Notebook";

                    System.out.println("Informe a memória RAM: ");
                        int memoriaRAM = input.nextInt();
                    System.out.println("Informe o processador: ");
                        int processador = input.nextInt();

                    NOTEBOOK eletrons = new NOTEBOOK(modelo, marca, voltagem, preco, tipoStr, memoriaRAM, processador);
                    aparelho.add(eletrons);
                } else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:

                for(int i = 0; i < aparelho.size(); i++){
                    System.out.println("Aparelhos " + (i + 1) + ": ");
                    System.out.println(aparelho.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o aparelho que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= aparelho.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    PRODUTOELETRONICO c = aparelho.get(index);

                    double desconto = c.calcularGarantia();
                    System.out.println("Valor original: " + c.preco);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.preco - desconto));
                }
                break;
            case 3:

                System.out.println("Lista de aparelhos: ");
                for(int i = 0; i < aparelho.size(); i++){
                    System.out.println("Aparelhos " + (i + 1) + ": ");
                    System.out.println(aparelho.get(i).exibirInformacoes());
                    System.out.println();
                }
                break;
            case 4:

                System.out.println("Lista de celulares: ");
                for(int i = 0; i < aparelho.size(); i++){
                    if(aparelho.get(i) instanceof CELULAR){
                        System.out.println("Celular " + (i + 1) + ": ");
                        System.out.println(aparelho.get(i).exibirInformacoesCelular());
                        System.out.println();
                    }
                }
                break;
            case 5:

                System.out.println("Lista de notebooks: ");
                for(int i = 0; i < aparelho.size(); i++){
                    if(aparelho.get(i) instanceof NOTEBOOK){
                        System.out.println("Notebook " + (i + 1) + ": ");
                        System.out.println(aparelho.get(i).exibirInformacoesNotebook());
                        System.out.println();
                    }
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