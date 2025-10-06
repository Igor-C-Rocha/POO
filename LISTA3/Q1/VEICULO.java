package LISTA3.Q1;

public class VEICULO{

    public String marca;
    public String modelo;
    public int ano;
    public double preco;

    public double calcularIpva(){
        return preco * 0.04f;
    }

    public String exibirDetalhes(){
        return " Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", R$ " + preco;
    }
}