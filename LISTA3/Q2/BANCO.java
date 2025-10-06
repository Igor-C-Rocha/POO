package LISTA3.Q2;

public class BANCO{

    public int numeroConta;
    public String Titular;
    public double Saldo;
    public double sacar;
    public double depositar;

    public static void println(String string){
        System.out.println(string);
    }

    public double depositar(double valor){
        return Saldo += valor;
    }

    public double sacar(double valor){

        if(valor > Saldo || valor <= 0){
            println("Saldo insuficiente");
            return Saldo;
        } else{
            return Saldo -= valor;
        }
    }

    public String consultarSaldo(){
        return "Seu saldo é: " + Saldo;
    }
}