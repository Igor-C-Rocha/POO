package eleicao.entidades;

public class Partido{
    
    private String nome;
    private String sigla;

    public Partido(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSigla(){
        return this.sigla;
    }
}