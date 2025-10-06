package LISTA3.Q1;

public class MOTO extends VEICULO{
    public int cilindrada;

    @Override
    public double calcularIpva(){
        return preco * 0.02f;
    }
}