package LISTA3.Q5;

public class NOTEBOOK extends PRODUTOELETRONICO{
    public String local;

    public NOTEBOOK(String modelo, String marca, double voltagem, double preco, String tipo, int memoriaRAM, int processador){
         this.memoriaRAM = memoriaRAM;
         this.processador = processador;
        this.modelo = modelo;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public double calcularGarantia(){
        return (preco * 0.25);
    }
}