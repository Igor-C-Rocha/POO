package LISTA4.Q7;

public class Carro extends Veiculo{

    private String modelo;

    public Carro(String cor, String modelo){
        //Como a classe Veiculo não possui um construtor padrão, o super se torna essencial.
        super(cor);
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
}