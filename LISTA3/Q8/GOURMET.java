package LISTA3.Q8;

public class GOURMET extends PRATO{
    public String local;

    public GOURMET(String nome, double tempoPrepraro, double preco, String tipo) {
        super(nome, tempoPrepraro, preco, tipo);
    }

    @Override
    public double calcularServico(){
        return (preco * 0.15);
    }
}