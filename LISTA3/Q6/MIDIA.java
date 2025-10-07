package LISTA3.Q6;

public class MIDIA{

    public int anoLancamento;
    public String titulo;
    public double duracao;
    public double preco;
    public String genero;
    public String diretor;
    public int numTemporada;
    public int numEpisodioTemporada;
    public String tipo;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularAlugue(){
        return (preco * 0.10);
    }

    public String exibirInformacoes(){
        return "Titulo: " + titulo + "\nanoLancamento: " + anoLancamento + "\nDuração: " + duracao + "\nPreço: " + preco;
    }

    public String exibirInformacoesFilme(){
        return "Titulo: " + titulo + "\nanoLancamento: " + anoLancamento + "\nDuração: " + duracao + "\nDiretor: " + diretor + "\nGenero: " + genero + "\nPreço: " + preco;
    }

    public String exibirInformacoesSerie(){
        return "Titulo: " + titulo + "\nanoLancamento: " + anoLancamento + "\nDuração: " + duracao + "\nTemporadas: " + numTemporada + "\nEp Por Temporada: " + numEpisodioTemporada + "\nPreço: " + preco;
    }

}