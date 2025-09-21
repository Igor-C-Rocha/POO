import java.util.Scanner;

public class Questao2{

public static int adicao(int A, int B){
return A + B;
}

public static int subtracao(int A, int B){
return A - B;
}

public static int multiplicacao(int A, int B){
return A * B;
}

public static double divisao(int A, int B){
    double C;

    if(B == 0){
        System.out.println("Não pode ter uma divisão por zero");
        return 0;
    } else{
        C = (double) A / B;
    System.out.printf("Resultado: %.2f\n", C);
    return C;
    }
}

public static void menu(){
    int opcao, A, B, aux;
    Scanner input = new Scanner(System.in);

    do{

    System.out.print("""
        ---MENU---

        1 - Adição
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        0 - Sair
        """);

    opcao = input.nextInt();

    if(opcao > 4 || opcao < 0){
        System.out.println("Opção Inválida ");
    } else {
        if(opcao == 0){
            System.out.println("Saindo ...");
            break;
        }
        switch(opcao){
            case 1:

            System.out.println("Qual o primeiro valor: ");
            A = input.nextInt();
            System.out.println("Qual o segundo valor: ");
            B = input.nextInt();

        aux = adicao(A,B);
        System.out.printf("Resultado: %d\n", aux);
            break;

            case 2:

            System.out.println("Qual o primeiro valor: ");
            A = input.nextInt();
            System.out.println("Qual o segundo valor: ");
            B = input.nextInt();

        aux = subtracao(A,B);
        System.out.printf("Resultado: %d\n", aux);
            break;

            case 3:

            System.out.println("Qual o primeiro valor: ");
            A = input.nextInt();
            System.out.println("Qual o segundo valor: ");
            B = input.nextInt();

        aux = multiplicacao(A,B);
        System.out.printf("Resultado: %d\n", aux);
            break;

            case 4:

            System.out.println("Qual o primeiro valor: ");
            A = input.nextInt();
            System.out.println("Qual o segundo valor: ");
            B = input.nextInt();

        divisao(A,B);
            break;
        }
      }
    }while(true);
}

public void run(){
    menu();
}
}