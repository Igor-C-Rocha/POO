package LISTA3.Q9;

public class DIDATICO extends LIVRO{
    public String local;

    public DIDATICO(String titulo, int anoPuplicacao, double preco, String autor, String tipo){
        this.titulo = titulo;
        this.anoPuplicacao = anoPuplicacao;
        this.preco = preco;
        this.autor = autor;
        this.tipo = tipo;
        this.diasAtraso = 0;

    }

    public void setDiasAtraso(double diasAtraso){
        this.diasAtraso = diasAtraso;
    }

    @Override
    public double calcularMulta(){
        return 1.00;
    }
}