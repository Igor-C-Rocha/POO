package LISTA3.Q10;

public class TRANSPORTE{

    public int capacidade;
    public int velocidadeMax;
    public double consumo;
    public double preco;
    public String tipo;
    public double distancia;
    public int numEixos;
    public String eletrico;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularconsumo(double distancia){
        return (distancia / consumo) * 5.50;
    }

    public double calcularDesconto(){
        return (preco * 0.10);
    }

    public String exibirInformacoes(){
        return "Capacidade: " + capacidade + "\nVelocidade Maxima: " + velocidadeMax + "\nConsumo: " + consumo + "\nPreço: " + preco;
    }

    public String exibirInformacoesOnibus(){
        return "Capacidade: "+ capacidade + "\nVelocidade Maxima: " + velocidadeMax + "\nConsumo: " + consumo + "\nPreço: " + preco + "\nNúmero de exiros: " + numEixos;
    }

    public String exibirInformacoesMetro(){
        return "Capacidade: "+ capacidade + "\nVelocidade Maxima: " + velocidadeMax + "\nConsumo: " + consumo + "\nPreço: " + preco + "\nTipo: " + eletrico;
    }
}