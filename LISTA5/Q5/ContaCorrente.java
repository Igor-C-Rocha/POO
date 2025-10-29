package LISTA5.Q5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numConta, double saldoInicial){
        super(numConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            AdicionarHistorico("Saque de R$: " + valor);
        return true;
        } else {
            AdicionarHistorico("Saldo insuficiente");
        return false;
        }
    }
}