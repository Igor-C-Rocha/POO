import java.util.Scanner;

public class Questao8{

public static void tabu(){
    int opcao, A, B = 0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Qual tabuada você quer: ");

    do{

    System.out.print("""

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

            System.out.println("Qual o valor: ");
            A = input.nextInt();

                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d + %d = %d \n", A, i, B = A + i);
                }
            break;

            case 2:

            System.out.println("Qual o valor: ");
            A = input.nextInt();

                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d - %d = %d \n", A, i, B = A - i);
                }
            break;

            case 3:

            System.out.println("Qual o valor: ");
            A = input.nextInt();

                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d * %d = %d \n", A, i, B = A * i);
                }
            break;

            case 4:

            System.out.println("Qual o valor: ");
            A = input.nextInt();

                for(int i = 1; i <= 10; i++){
                    System.out.printf("%d / %d = %d \n", A, i, B = A / i);
                }
            break;
        }
      }
    }while(true);
}

public void run(){
    tabu();
    }
}