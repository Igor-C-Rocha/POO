package eleicao.entidades;

import eleicao.interfaces.Candidato;

public class Prefeito implements Candidato{

    private String nome;
    private Partido partido;
    private int numeroCandidato;
    private int totalVotos;

    public Prefeito(String nome, Partido partido, int numeroCandidato){
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
        this.totalVotos = 0;
    }

    @Override
    public int getnumeroCandidato(){
        return numeroCandidato;
    }

    @Override
    public void receberVoto(){
        totalVotos++;
    }

    @Override
    public void exibirDados(){
        System.out.println("Prefeito: " + nome + "\nPartido: " + partido.getSigla() + "\nNº: " + numeroCandidato);
    }

    public int getTotalVoto(){
        return totalVotos;
    }

    @Override
    public int TotalVoto(){
        return totalVotos;
    }
}