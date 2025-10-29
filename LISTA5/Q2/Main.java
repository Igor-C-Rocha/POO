package LISTA5.Q2;

public class Main{

    public static void main(String[] args){
        Checkout checkout = new Checkout();

        CartaoCredito cartao = new CartaoCredito(1000);
        Pix pix = new Pix();
        Boleto boleto = new Boleto();

        checkout.Finalizar(cartao, 800);
        checkout.Finalizar(cartao, 1200);
        checkout.Finalizar(pix, 300);
        checkout.Finalizar(boleto, 150);
    }
}