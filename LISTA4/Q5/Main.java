package LISTA4.Q5;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
            String senha = input.nextLine();

        ValidadorSeguranca validador = new ValidadorSeguranca();
        boolean formatoValido = validador.validarFormato(senha);

        if (formatoValido){
            validador.validarAcesso(senha);
        } else{
            System.out.println("Formato inválido!");
        }
    }
}