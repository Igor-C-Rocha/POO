package LISTA4.Q1;

public class Fatura{

    public int valor;

    public Fatura(int valor){
        this.valor = valor;
    }

    public String exibirRascunho(){
        return String.valueOf(valor + 1);
    }

    public String exibirAlta(){
        return String.valueOf(valor + 1);
    }
}