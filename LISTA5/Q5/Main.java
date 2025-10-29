package LISTA5.Q5;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente(1001, 0);
        ContaPoupanca cp = new ContaPoupanca(2001, 0);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        for(ContaBancaria conta : contas){
            conta.depositar(1000);
            System.out.println("\nDepósito de R$1000 realizado.");

            if(conta.sacar(300)){
                System.out.println("Saque de R$300 aprovado.");
            } else {
                System.out.println("Saque de R$300 negado.");
            }
            if(conta.sacar(900)){
                System.out.println("Saque de R$900 aprovado.");
            } else {
                System.out.println("Saque de R$900 negado.");
            }
            conta.exibirHistorico();
        }
    }
}