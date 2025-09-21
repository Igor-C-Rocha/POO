import java.util.Scanner;

public class Questao23{

    public static double reajuste(double salario, double indice){
        return salario + (salario * (indice / 100));
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        double salario, indice, novo;
        
        System.out.println("Informe seu salário atual: ");
            salario = input.nextDouble();
        System.out.println("Informe o índice do reajuste: ");
            indice = input.nextDouble();
        
        novo = reajuste(salario, indice);

        System.out.printf("O novo salário é: %.2f", novo);
    }
}