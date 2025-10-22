package eleicao.entidades;

import eleicao.interfaces.Candidato;

public abstract class Politico implements Candidato{

    protected String nome;

    protected Partido partido;

    protected int numeroCandidato;

    protected int totalVoto;

    public Politico(String nome, Partido partido, int numeroCandidato){
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
        this.totalVoto = 0;
    }

    @Override
    public int getnumeroCandidato(){
        return numeroCandidato;
    }

    public int getTotalVoto(){
        return totalVoto;
    }
    
    @Override
    public int TotalVoto(){
        return totalVoto;
    }

    @Override
    public void receberVoto(){
        totalVoto++;
    }

    @Override
    public void exibirDados(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Partido: " + this.partido.getNome() + " ( " + this.partido.getSigla() + " )");
        System.out.println("Número: " + this.numeroCandidato);
        System.out.println("Cargo: " + getGargo());
    }

    public abstract String getGargo();
}