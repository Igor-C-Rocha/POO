package LISTA5.Q5;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements Registravel{

    protected int numConta;
    protected double saldo;
    protected List<String> historico;

    public ContaBancaria(int numConta, double saldoInicial){
        this.numConta = numConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
    }

    @Override
    public void AdicionarHistorico(String transacao){
        historico.add(transacao);
    }

    public void depositar(double valor){
        saldo += valor;
        AdicionarHistorico("\nDépósito de: " + valor + " feito");
    }

    public abstract boolean sacar(double valor);

    public void exibirHistorico(){
        System.out.printf("Histórico da conta: " + numConta);

        for(String h : historico){
            System.out.println(h);
        }
        System.out.println("Saldo atual: " + saldo);
    }
}