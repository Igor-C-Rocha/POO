package LISTA3.Q7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<ESPORTE> mess = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Adicionar esporte
        2 - Listar todos os esportes
        3 - consultar regras
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:

                input.nextLine();

                System.out.print("Qual esporte quer adicionar: \n 1 - Basquete 2 - Futebol\n");
                    int esporte = input.nextInt();
                
                if(esporte == 1){
                    input.nextLine();

                    System.out.print("Nome: ");
                        String nome = input.nextLine();
                    System.out.print("Numero de Jogadores: ");
                        int numeroJogadores = input.nextInt();
                    System.out.print("Duração da Partida: ");
                        double duracaoPartida = input.nextDouble();
                    System.out.print("Popularidade: ");
                        double popularidade = input.nextDouble();
                    System.out.print("Altura do Cesto: ");
                        double alturaCesto = input.nextDouble();

                    BASQUETE bola = new BASQUETE(numeroJogadores, nome, duracaoPartida, popularidade, alturaCesto);
                    mess.add(bola);   
                } else if(esporte == 2){
                    input.nextLine();

                    System.out.print("Nome: ");
                        String numero = input.nextLine();
                    System.out.print("Numero de Jogadores: ");
                        int numeroJogadores = input.nextInt();
                    System.out.print("Duração da Partida: ");
                        double duracaoPartida = input.nextDouble();
                    System.out.print("Popularidade: ");
                        double popularidade = input.nextDouble();
                    System.out.print("Tamanho do Campo: ");
                        double tamanhoCampo = input.nextDouble();

                    FUTEBOL futebol = new FUTEBOL(numeroJogadores, numero, duracaoPartida, popularidade, tamanhoCampo);
                    mess.add(futebol);
                } else{
                    System.out.println("Esporte inválido!");
                }
                break;
            case 2:

                for(ESPORTE rona : mess){
                    if(rona instanceof BASQUETE){
                        ESPORTE.println(rona.exibirInformacoesBasquete());
                    } else if(rona instanceof FUTEBOL){
                        ESPORTE.println(rona.exibirInformacoesFutebol());
                    }
                }
                break;
            case 3:

                System.out.print("Qual esporte quer consultar as regras: \n 1 - Basquete 2 - Futebol\n");
                    int ney = input.nextInt();
                
                if(ney == 1){
                    ESPORTE.println(new ESPORTE().regrasBasquete());
                } else if(ney == 2){
                    ESPORTE.println(new ESPORTE().regrasFutebol());
                } else{
                    System.out.println("Esporte inválido!");
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