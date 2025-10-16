package LISTA4.Q2;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do desenvolvedor: ");
            String nome = input.nextLine();

        System.out.println("Digite o código do cargo 1 - Júnior, 2 - Pleno, 3 - Sênior: ");
            int codigo = input.nextInt();

        System.out.println("Digite o salário-base: ");
            double salarioBase = input.nextDouble();

        Desenvolvedor dev = new Desenvolvedor(nome, codigo);
        double bonus = dev.calcularBonificacao(salarioBase);
        
        System.out.println("\nFuncionário: " + nome);
        System.out.println("Bônus anual: R$" + bonus);
    }
}