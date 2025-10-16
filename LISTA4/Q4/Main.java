package LISTA4.Q4;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Deseja iniciar uma tarefa longa? (s/n): ");
            String opcao = input.nextLine();

        if (opcao.equalsIgnoreCase("s")){
            TarefaLonga tarefa = new TarefaLonga();
                tarefa.executar();

            System.out.println("Status final da tarefa: " + (tarefa.isConcluida() ? "Concluída" : "Pendente"));
        } else {
            System.out.println("Nenhuma tarefa foi iniciada.");
        }
    }
}