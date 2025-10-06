package LISTA3.Q3;

public class CURSOPRESENCIAL extends CURSO{
    public String local;

    public CURSOPRESENCIAL(double cargaHoraria, String nome, String nivel, String metodo, String local, double valor){
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.nivel = nivel;
        this.metodo = metodo;
        this.local = local;
        this.valor = valor;
    }

    @Override
    public double calcularDesconto(){
        return (valor * 0.05);
    }
}