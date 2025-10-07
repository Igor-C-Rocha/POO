package LISTA3.Q4;

public class CASA extends IMOVEL{
    public String local;

    public CASA(String endereco, String area, double numeroQuartos, double preco, String tipo){
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public double calcularTaxa(){
        return (preco * 0.10);
    }
}