package eleicao.entidades;

public class Voto{
    
    private Eleitor eleitor;
    private int numeroCandidato;

    public Voto(Eleitor eleitor, int numeroCandidato){
        this.eleitor = eleitor;
        this.numeroCandidato = numeroCandidato;
    }

    public Eleitor getEleitor(){
        return eleitor;
    }

    public int getnumeroCandidato(){
        return numeroCandidato;
    }
}