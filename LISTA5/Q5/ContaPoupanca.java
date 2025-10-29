package LISTA5.Q5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numConta, double saldoInicial){
        super(numConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor){

        double valorTaxa = valor + 1.00;

        if(saldo >= valorTaxa){
            saldo -= valorTaxa;
            AdicionarHistorico("Saque de R$: " + valor);
        return true;
        } else {
            AdicionarHistorico("Saldo insuficiente");
        return false;
        }
    }
}