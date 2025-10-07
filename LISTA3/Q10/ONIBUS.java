package LISTA3.Q10;

public class ONIBUS extends TRANSPORTE{
    public String local;

    public ONIBUS(int capacidade, int velocidadeMax, double consumo, double preco, int numEixos){
        this.capacidade = capacidade;
        this.velocidadeMax = velocidadeMax;
        this.consumo = consumo;
        this.preco = preco;
        this.numEixos = numEixos;
    }

    @Override
    public double calcularDesconto(){
        return (preco * 0.20);
    }
}