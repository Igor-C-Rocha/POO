package LISTA3.Q3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<CURSO> aula = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Criar curso
        2 - Consultar descontos e informações do curso
        3 - Listar todos os cursos
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:
                input.nextLine();

                    System.out.println("Informe o nome do curso: ");
                        String nome = input.nextLine();

                    System.out.println("Informe o nível do curso: \n(Básico, Intermediário, Avançado)");
                        String nivel = input.nextLine();

                    System.out.println("Informe a carga horária do curso: ");
                        double cargaHoraria = input.nextDouble();

                input.nextLine();

                    System.out.println("Informe o local do curso: ");
                        String local = input.nextLine();

                    System.out.println("Informe o valor do curso: ");
                        double valor = input.nextDouble();
                    
                    System.out.println("Informe o tipo do curso: \n(1 - Presencial, 2 - Online)");
                        int tipo = input.nextInt();
                if(tipo == 1){

                    String metodo = "Presencial";
                    CURSOPRESENCIAL cursoPresencial = new CURSOPRESENCIAL(cargaHoraria, nome, nivel, metodo, local, valor);
                    aula.add(cursoPresencial);
                } else if(tipo == 2){
                    
                    String metodo = "Online";
                    CURSOONLINE cursoOnline = new CURSOONLINE(cargaHoraria, nome, nivel, metodo, "Online", valor);
                    aula.add(cursoOnline);
                } else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:

                for(int i = 0; i < aula.size(); i++){
                    System.out.println("Curso " + (i + 1) + ": ");
                    System.out.println(aula.get(i).exibirInformacoes());
                    System.out.println();
                }

                System.out.println("Informe o curso que deseja consultar: ");
                    int numeroCurso = input.nextInt();
                    int index = numeroCurso - 1;

                if(index < 0 || index >= aula.size()){
                    System.out.println("Índice inválido!");
                    break;
                } else{
                    CURSO c = aula.get(index);

                    double desconto = c.calcularDesconto();
                    System.out.println("Valor original: " + c.valor);
                    System.out.println("Desconto: " + desconto);
                    System.out.println("Valor com desconto: " + (c.valor - desconto));
                }
                break;
            case 3:

                System.out.println("Lista de cursos: ");
                for(int i = 0; i < aula.size(); i++){
                    System.out.println("Curso " + (i + 1) + ": ");
                    System.out.println(aula.get(i).exibirInformacoes());
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