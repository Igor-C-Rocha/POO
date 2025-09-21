import java.util.Scanner;

public class Questao24{

public static String Verifica(int n){

    if(n % 2 == 0){
        return "PAR";
    } else{
        return "ÍMPAR";
    }
   }
   
public void run(){

    Scanner input = new Scanner(System.in);
    int numero;

    System.out.printf("Digite o número: ");
        numero = input.nextInt();
    System.out.println(Verifica(numero));
   }
}