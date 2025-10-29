package LISTA5.Q2;

public class Checkout{

    public void Finalizar(ProcessadorPagamento metodo, double valorTotal){

        System.out.printf("Iniciando pagamento R$ " + valorTotal);

        boolean sucesso = metodo.processar(valorTotal);

        if(sucesso){
            System.out.println("Transação feita");
        } else {
            System.out.println("Erro");
        }
    }
}