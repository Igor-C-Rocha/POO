package LISTA3.Q7;

public class FUTEBOL extends ESPORTE{
    public String local;

    public FUTEBOL(int numeroJogadores, String nome, double duracaoPartida, double popularidade, double tamanhoCampo){
        this.numeroJogadores = numeroJogadores;
        this.nome = nome;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double base(){
        return (400.00);
    }
}