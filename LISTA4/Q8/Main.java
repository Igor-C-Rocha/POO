package LISTA4.Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<IComando> comandos = new ArrayList<>();

        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        System.out.println("Digite parâmetros separados por vírgula:");
            String entrada = input.nextLine();

        String[] parametros = entrada.split(",");

        System.out.println("\nEXECUTANDO COMANDOS");

        for (IComando cmd : comandos){
            cmd.executar(parametros);
            System.out.println("----------------------------");
        }
    }
}