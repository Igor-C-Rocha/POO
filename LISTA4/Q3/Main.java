package LISTA4.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        List<IProcessador> processadores = new ArrayList<>();
        processadores.add(new Processador());

        System.out.print("Quantas linhas de dados deseja inserir? ");
        int qtd = input.nextInt();
        input.nextLine(); 

        String[] dados = new String[qtd];

        System.out.println("Digite as linhas de dados CSV (ex: id,nome,idade):");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Linha " + i + ": ");
            dados[i] = input.nextLine();
        }

        for (IProcessador processador : processadores) {
            processador.processar(dados);
        }
    }
}