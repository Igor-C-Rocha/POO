import java.util.Scanner;

public class Questao26{

    public static boolean Equilatero(int a, int b, int c){
        if(a == b && b == c){
            System.out.println("É um triângulo equilátero ");
            return true;
        } else{
            System.out.println("Não é triângulo equilátero ");
            return false;
        }
    }

    public static boolean Isosceles(int a, int b, int c){
        if(a == b || b == c || a == c){
            System.out.println("É um triângulo isósceles ");
            return true;
        } else{
            System.out.println("Não é triângulo isósceles ");
            return false;
        }
    }

    public static boolean Escaleno(int a, int b, int c){
        if(a != b && b !=c && a != c){
            System.out.println("É um triângulo escaleno ");
            return true;
        } else{
            System.out.println("Não é triângulo escaleno ");
            return false;
        }
    }

    public static boolean Invalido(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Não é válido ");
            return true;
        } else{
            System.out.println("É válido ");
            return false;
        }
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o lado A: ");
            a = input.nextInt();
        System.out.println("Digite o lado B: ");
            b = input.nextInt();
        System.out.println("Digite o lado C: ");
            c = input.nextInt();

        Invalido(a, b, c);
        Equilatero(a, b, c);
        Isosceles(a, b, c);
        Escaleno(a, b, c);
    }
}