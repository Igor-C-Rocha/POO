package LISTA3.Q4;

public class APARTAMENTO extends IMOVEL{
    public String local;

    public APARTAMENTO(String endereco, String area, double numeroQuartos, double preco, String tipo){
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public double calcularTaxa(){
        return (preco * 0.06);
    }
}