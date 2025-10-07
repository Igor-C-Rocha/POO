package LISTA3.Q7;

public class BASQUETE extends ESPORTE{
    public String local;

    public BASQUETE(int numeroJogadores, String nome, double duracaoPartida, double popularidade, double alturaCesto){
        this.numeroJogadores = numeroJogadores;
        this.nome = nome;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
        this.alturaCesto = alturaCesto;
    }

    @Override
    public double base(){
        return (300.00);
    }
}