package LISTA3.Q5;

public class CELULAR extends PRODUTOELETRONICO{
    public String local;

    public CELULAR(String modelo, String marca, double voltagem, double preco, String tipo, double tamanhoTela, int capacidadeBateria){
         this.tamanhoTela = tamanhoTela;
         this.capacidadeBateria = capacidadeBateria;
        this.modelo = modelo;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public double calcularGarantia(){
        return (preco * 0.20);
    }
}