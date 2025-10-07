package LISTA3.Q8;

import java.util.List;
import java.util.ArrayList;

public class PRATO{

    public double tempoPrepraro;
    public String nome;
    public double preco;
    public String tipo;
    public List<String> ingredientes = new ArrayList<>();

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularServico(){
        return (preco * 0.10);
    }

    public PRATO(String nome, double tempoPrepraro, double preco, String tipo) {
        this.nome = nome;
        this.tempoPrepraro = tempoPrepraro;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String exibirInformacoes(){
        return "Nome: " + nome + "\nTempo de prepraro: " + tempoPrepraro + "\nPreço: " + preco;
    }

    public void adicionarIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
    }

    public String exibirListaDeIngredientes(List<String> listaIngredientes){
        String ingredientes = "Ingredientes: ";
        for(int i = 0; i < listaIngredientes.size(); i++){
            ingredientes += listaIngredientes.get(i);
            if(i < listaIngredientes.size() - 1){
                ingredientes += ", ";
            }
        }
        return ingredientes;
    }
}