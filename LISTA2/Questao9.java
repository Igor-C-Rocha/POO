import java.util.Scanner;

public class Questao9{

public static void negativo(){
    int auxImpar = 0, auxPar = 0, opcao;
    Scanner input = new Scanner(System.in);

    System.out.println("Vá irformando os valores: ");

    do{
        opcao = input.nextInt();

    if(opcao < 0){
        break;
    }

    if(opcao % 2 != 0){
        auxImpar = opcao + auxImpar;
    } else {
        auxPar = opcao + auxPar;
    }

    }while(opcao >= 0);

System.out.printf("""
        
    Soma total dos valores:
    Ímpares: %d
    Pares: %d

        """, auxImpar, auxPar);
}

public void run(){
    negativo();
    }
}