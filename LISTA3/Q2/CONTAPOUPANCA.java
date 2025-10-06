package LISTA3.Q2;

public class CONTAPOUPANCA extends BANCO{
    public double taxaRendimento;

    public CONTAPOUPANCA(int numeroConta, String Titular, double Saldo, double taxaRendimento){
        this.numeroConta = numeroConta;
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.taxaRendimento = taxaRendimento;
    }
    
    public double renderJuros(){
        return Saldo += (Saldo * (taxaRendimento / 100));
    }

    @Override
    public double sacar(double valor){
        println("Operação não permitida em conta poupança");
        return Saldo;
    }
}