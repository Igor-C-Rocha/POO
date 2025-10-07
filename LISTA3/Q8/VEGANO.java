package LISTA3.Q8;

public class VEGANO extends PRATO{
    public String local;

    public VEGANO(String nome, double tempoPrepraro, double preco, String tipo) {
        super(nome, tempoPrepraro, preco, tipo);
    }

    @Override
    public double calcularServico(){
        return (preco * 0.05);
    }
}