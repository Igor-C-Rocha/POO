package LISTA3.Q2;

public class CONTABANCARIA extends BANCO{
    public double limiteChequeEspecial;

    public CONTABANCARIA(int numeroConta, String Titular, double Saldo, double limiteChequeEspecial){
        this.numeroConta = numeroConta;
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double sacar(double valor){
        if(valor > (Saldo + limiteChequeEspecial) || valor <= 0){
            println("Limite do cheque especial excedido");
            return Saldo;
        } else{
            return Saldo -= valor;
        }
    }
}