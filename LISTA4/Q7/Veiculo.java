package LISTA4.Q7;

public abstract class Veiculo{
    protected String cor;

    public Veiculo(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void exibirInfo(){
        System.out.println("Cor do veículo: \n" + cor);
    }
}