import java.util.Scanner;

public class Questao5{

public static long fatorial(int num){
    int aux = 1;

    for(int i = 2; i <= num; i++){
        aux *= i;
    }
    return aux;
}

public static void menu(){
    int aux, num; 
    long resultado;
    Scanner input = new Scanner(System.in);

    System.out.println("Quantos números quer implementar: ");
    aux = input.nextInt();

    for(int i = 1; i <= aux; i++){
        System.out.printf("%d° número: \n", i);
    num = input.nextInt();

    resultado = fatorial(num);

    System.out.printf("""
            Fatorial do:
            %d é %d

            """, num, resultado);
    }
    input.close();
}

public void run(){
    menu();
}
}