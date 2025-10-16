package LISTA4.Q2;

public abstract class Funcionario{
    protected String nome;
    protected int codigoCargo;

    public Funcionario(String nome, int codigoCargo){
        this.nome = nome;
        this.codigoCargo = codigoCargo;
    }

    public abstract double calcularBonificacao(double salarioBase);
}