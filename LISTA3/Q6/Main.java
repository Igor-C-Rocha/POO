package LISTA3.Q6;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<MIDIA> net = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar uma midia
        2 - Consultar informações
        3 - Listar todos as midias
        4 - Listar todos os Filmes
        5 - Listar todas as Series
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o titulo: ");
                        String titulo = input.nextLine();

                    System.out.println("Informe o ano de lançamento: ");
                        int anoLancamento = input.nextInt();

                    System.out.println("Informe a duração: ");
                        double duracao = input.nextDouble();

                input.nextLine();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo da midia: \n(1 - Filme, 2 - Serie)");
                        int tipo = input.nextInt();
                if(tipo == 1){

                    String tipoStr = "Filme";
                    System.out.println("Informe o diretor: ");
                        String diretor = input.nextLine();
                    System.out.println("Informe o gereno: ");
                        String genero = input.nextLine();

                    FILME eletrons = new FILME(titulo, anoLancamento, duracao, preco, diretor, genero, tipoStr);
                    net.add(eletrons);
                } else if(tipo == 2){
                    
                    String tipoStr = "Serie";
                    System.out.println("Informe o número de temporadas: ");
                        int numTemporada = input.nextInt();
                    System.out.println("Informe o número de episódios por temporada: ");
                        int numEpisodioTemporada = input.nextInt();

                    SERIE eletrons = new SERIE(titulo, anoLancamento, duracao, preco, numTemporada, numEpisodioTemporada, tipoStr);
                    net.add(eletrons);
                } else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:

                for(int i = 0; i < net.size(); i++){
                    System.out.println("Midia " + (i + 1) + ": ");
                    System.out.println(net.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o número da midia que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= net.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    MIDIA c = net.get(index);

                    double desconto = c.calcularAlugue();
                    System.out.println("Valor original: " + c.preco);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.preco - desconto));
                }
                break;
            case 3:

                System.out.println("Lista de midias: ");
                for(int i = 0; i < net.size(); i++){
                    System.out.println("Midia " + (i + 1) + ": ");
                    System.out.println(net.get(i).exibirInformacoes());
                    System.out.println();
                }
                break;
            case 4:

                System.out.println("Lista de filmes: ");
                for(int i = 0; i < net.size(); i++){
                    if(net.get(i) instanceof FILME){
                        System.out.println("Filmes " + (i + 1) + ": ");
                        System.out.println(net.get(i).exibirInformacoesFilme());
                        System.out.println();
                    }
                }
                break;
            case 5:

                System.out.println("Lista de series: ");
                for(int i = 0; i < net.size(); i++){
                    if(net.get(i) instanceof SERIE){
                        System.out.println("Series " + (i + 1) + ": ");
                        System.out.println(net.get(i).exibirInformacoesSerie());
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