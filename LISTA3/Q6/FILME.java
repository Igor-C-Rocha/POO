package LISTA3.Q6;

public class FILME extends MIDIA{
    public String local;

    public FILME(String titulo, int anoLancamento, double duracao, double preco, String diretor, String genero, String tipo){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
        this.diretor = diretor;
        this.genero = genero;
        this.tipo = tipo;
    }

    @Override
    public double calcularAlugue(){
        return (preco * 0.15);
    }
}