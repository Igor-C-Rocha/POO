package LISTA3.Q10;

public class METRO extends TRANSPORTE{
    public String local;

    public METRO(int capacidade, int velocidadeMax, double consumo, double preco, String tipo){
        this.capacidade = capacidade;
        this.velocidadeMax = velocidadeMax;
        this.consumo = consumo;
        this.preco = preco;
        this.tipo = tipo;
        this.eletrico = "Eletrico";
    }

    @Override
    public double calcularDesconto(){
        return (preco * 0.30);
    }
}