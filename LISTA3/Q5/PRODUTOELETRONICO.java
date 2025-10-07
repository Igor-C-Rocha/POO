package LISTA3.Q5;

public class PRODUTOELETRONICO{

    public double preco;
    public String modelo;
    public String marca;
    public double voltagem;
    public String tipo;
    public double tamanhoTela;
    public int capacidadeBateria;
    public int memoriaRAM;
    public int processador;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularGarantia(){
        return (preco * 0.15);
    }

    public String exibirInformacoes(){
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nVoltagem: " + voltagem + "\nPreço: " + preco;
    }

    public String exibirInformacoesCelular(){
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nVoltagem: " + voltagem + "\nTamanho da Tela: " + tamanhoTela + "\nCapacidade da Bateria: " + capacidadeBateria + "\nPreço: " + preco;
    }

    public String exibirInformacoesNotebook(){
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nVoltagem: " + voltagem + "\nMemória RAM " + memoriaRAM + "\nProcessador" + processador + "\nPreço: " + preco;
    }
}