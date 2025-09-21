import java.util.Scanner;

public class Questao10{

    public static void quadrado(){
        int aux = 0, valor, total = 0, abobora;
        Scanner input = new Scanner(System.in);

        do{
        System.out.println("Informe o valore entre 1 e 9: ");
            valor = input.nextInt();

        }while(valor <= 0 || valor >= 10);

    if(valor % 2 == 0){
        valor++;
    }

    abobora = valor;

    while(aux < 20){
        total += valor * valor;
        valor += 2;
        aux++;
    }

    System.out.printf("Soma dos quadrados dos 20 primeiros números ímpares a partir de %d é: %d\n", abobora, total);
    }

    public void run(){
        quadrado();
    }
}