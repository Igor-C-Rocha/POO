package LISTA3.Q9;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<LIVRO> ler = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar Livro
        2 - Consultar informações
        3 - Listar todos os livros
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o titulo: ");
                        String titulo = input.nextLine();

                    System.out.println("Informe o ano de publicação: ");
                        int anoPublicacao = input.nextInt();
                            input.nextLine();

                    System.out.println("Informe o nome do autor: ");
                        String autor = input.nextLine();

                    System.out.println("Informe o preço: ");
                        double preco = input.nextDouble();
                    
                    System.out.println("Informe o tipo do livro: \n(1 - DIDATICO, 2 - RARO)");
                        int tipo = input.nextInt();
                    LIVRO livro = null;

                if(tipo == 1){
                    livro = new DIDATICO(titulo, anoPublicacao, preco, autor, "Didático");
                } else if(tipo == 2){
                    livro = new RARO(titulo, anoPublicacao, preco, autor, "Raro");
                } else{
                    System.out.println("Tipo inválido!");
                    break;
                }
                    System.out.println("Houve atraso na devolução? (S/N)");
                        char atraso = input.next().charAt(0);

                if(atraso == 'S' || atraso == 's'){
                    System.out.println("Informe a quantidade de dias em atraso: ");
                        int diasAtraso = input.nextInt();
                livro.setDiasAtraso(diasAtraso);
                } else if(atraso == 'N' || atraso == 'n'){
                    System.out.println("Sem atraso na devolução.");
                } else{
                    System.out.println("Opção inválida!");
                }
                ler.add(livro);
                break;
            case 2:

                for(int i = 0; i < ler.size(); i++){
                    System.out.println("Livro " + (i + 1) + ": ");
                    System.out.println(ler.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o número do livro que deseja consultar: ");
                    int numero = input.nextInt();
                    int index = numero - 1;

                if(index < 0 || index >= ler.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    LIVRO c = ler.get(index);

                    double multaPorDia = c.calcularMulta();
                    double multaTotal = multaPorDia * c.diasAtraso;
                    double valorComMulta = c.preco + multaTotal;

                System.out.println("Valor original: R$" + c.preco);
                System.out.println("Multa por dia: R$" + multaPorDia);
                System.out.println("Dias de atraso: " + c.diasAtraso);
                System.out.println("Multa total: R$" + multaTotal);
                System.out.println("Valor com multa: R$" + valorComMulta);
                }
                break;
            case 3:

                System.out.println("Lista de livros: ");
                for(int i = 0; i < ler.size(); i++){
                    System.out.println("Livro " + (i + 1) + ": ");
                    System.out.println(ler.get(i).exibirInformacoes());
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