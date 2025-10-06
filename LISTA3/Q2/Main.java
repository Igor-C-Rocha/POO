package LISTA3.Q2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    List<BANCO> conta = new ArrayList<>();
    int opcao;

    do{
        System.out.printf("""

        1 - Criar conta
        2 - Depositar
        3 - Sacar
        4 - Consultar saldo
        0 - Sair

        """);
    opcao = input.nextInt();

        switch(opcao){
            case 1:

            System.out.println("Qual o tipo da conta?\n 1 - Conta Poupança 2 - Conta Bancária \n");
                int tipoConta = input.nextInt();

            System.out.println("Informe o número da conta: ");
                int numeroConta = input.nextInt();
            System.out.println("Informe o titular da conta: ");
                String Titular = input.next();
            System.out.println("Informe o saldo: ");
                double Saldo = input.nextDouble();

            if(tipoConta == 2){

                System.out.println("Informe o limite do cheque especial: ");
                    double limiteChequeEspecial = input.nextDouble();

                conta.add(new CONTABANCARIA(numeroConta, Titular, Saldo, limiteChequeEspecial));

            } else if(tipoConta == 1){

                System.out.println("Informe a taxa de rendimento: ");
                    double taxaRendimento = input.nextDouble();

                conta.add(new CONTAPOUPANCA(numeroConta, Titular, Saldo, taxaRendimento));

            } else{
                System.out.println("Tipo inválido!");
            }
                break;
            case 2:

                System.out.println("Qual o tipo da conta?\n 1 - Conta Poupança 2 - Conta Bancária \n");
                    tipoConta = input.nextInt();

                if(tipoConta != 1 && tipoConta != 2){

                    System.out.println("Tipo inválido!");
                } else if(tipoConta == 1){

                    System.out.println("Depósito em conta poupança selecionado.");
                    System.out.println("Informe o valor a deposatar: ");
                    double valorDeposito = input.nextDouble();
                for(BANCO c : conta){
                    c.depositar(valorDeposito);
                    System.out.println("Depósito realizado! ");
                    }
                } else{

                    System.out.println("Depósito em conta bancária selecionado.");
                    System.out.println("Informe o valor a deposatar: ");
                    double valorDeposito = input.nextDouble();
                for(BANCO c : conta){
                    c.depositar(valorDeposito);
                    System.out.println("Depósito realizado! ");
                    }
                }  
                break;
            case 3:

                System.out.println("Qual o tipo da conta?\n 1 - Conta Poupança 2 - Conta Bancária \n");
                    tipoConta = input.nextInt();

                if(tipoConta != 1 && tipoConta != 2){

                    System.out.println("Tipo inválido!");
                }else if (tipoConta == 1){

                    System.out.println("Não é possível sacar de uma conta poupança!");
                    break;
                } else{

                    System.out.println("Saque em conta bancária selecionado.");
                    System.out.println("Informe o valor a sacar: ");
                    double valorSaque = input.nextDouble();
                for(BANCO c : conta){
                    c.sacar(valorSaque);
                    System.out.println("Saque realizado! ");
                }
                }
                break;
            case 4:

                System.out.println("Qual o tipo da conta?\n 1 - Conta Poupança 2 - Conta Bancária \n");
                    tipoConta = input.nextInt();
                
                if(tipoConta != 1 && tipoConta != 2){
                    System.out.println("Tipo inválido!");
                    break;
                } else if(tipoConta == 1){
                    System.out.println("Saldo da conta poupança: ");

                    for(BANCO c : conta){
                        if(c instanceof CONTAPOUPANCA){
                            System.out.println(((CONTAPOUPANCA)c).renderJuros());
                        }
                    }
                } else{
                    System.out.println("Saldo da conta bancária: ");

                    for(BANCO c : conta){
                        if(c instanceof CONTABANCARIA){
                            System.out.println(c.consultarSaldo());
                        }
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