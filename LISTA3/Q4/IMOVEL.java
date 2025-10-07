package LISTA3.Q4;

public class IMOVEL{

    public double numeroQuartos;
    public String endereco;
    public String area;
    public double preco;
    public String tipo;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularTaxa(){
        return (preco * 0.08);
    }

    public String exibirInformacoes(){
        return "Endereço: " + endereco + "\nArea: " + area + "\nPreço: " + preco + "\nNúmero de Quartos: " + numeroQuartos;
    }
}