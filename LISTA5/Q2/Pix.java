package LISTA5.Q2;

public class Pix implements ProcessadorPagamento{

    @Override
    public boolean processar(double valor){
        System.out.println("\nPagamento de R$ " + valor + " recebido\n");
        return true;
    }
}