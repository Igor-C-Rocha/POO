package LISTA3.Q6;

public class SERIE extends MIDIA{
    public String local;

    public SERIE(String titulo, int anoLancamento, double duracao, double preco, int numTemporada, int numEpisodioTemporada, String tipo){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
        this.numTemporada = numTemporada;
        this.numEpisodioTemporada = numEpisodioTemporada;
        this.tipo = tipo;
    }

    @Override
    public double calcularAlugue(){
        return (preco * 0.12);
    }
}