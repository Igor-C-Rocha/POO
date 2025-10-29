package LISTA5.Q2;

public class Boleto implements ProcessadorPagamento{

    @Override
    public boolean processar(double valor){
        System.out.println("\nBoleto de R$ " + valor + " gerado\n");
        return true;
    }
}