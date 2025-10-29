package LISTA5.Q2;

public class CartaoCredito implements ProcessadorPagamento{
    private double limite;

    public CartaoCredito(double limite){
        this.limite = limite;
    }

    @Override
    public boolean processar(double valor){

        if(valor <= limite){
            System.out.printf("\nPagamento de R$ " + valor + " aprovado\n");
        
        limite -= valor;
        return true;
        } else {
            System.out.printf("\nPagamento de R$ " + valor + " regusado\n");
        return false;
        }
    }
}