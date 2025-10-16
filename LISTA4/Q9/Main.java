package LISTA4.Q9;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque do produto: ");
            int estoque = input.nextInt();

        ProdutoAlimenticio produto = new ProdutoAlimenticio(estoque);

        System.out.print("Digite a quantidade que deseja comprar: ");
            int quantidadeSolicitada = input.nextInt();

        produto.verificarDisponibilidade(quantidadeSolicitada);
    }
}