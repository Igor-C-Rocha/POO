import java.util.Scanner;

public class Questao15{

public static void poluicao( double A){

    if(A == 0.0){
        System.out.println("Nível de pulição otimas ");
        System.out.println("Saindo do programa... ");
        System.exit(0);
    } else {
    if(A >= 0.05 && A <= 0.25){
        System.out.println("Nível de poluição estavel ");
    } else if(A >= 0.26 && A <= 0.30){
        System.out.println("1º grupo deve suspender suas atividades ");
    } else if(A >= 0.31 && A <= 0.49){
        System.out.println("1° e 2° grupo devem suspender suas atividades ");
    } else if(A > 0.50){
        System.out.println("Todos os grupos devem suspender suas atividades ");
    }
   }
}

public static void menu(){
    int opcao;
    double A, aux;
    Scanner input = new Scanner(System.in);

    do{
    System.out.print("""
        ---MENU---

        1 - Poluição
        2 - Sair

        """);

    opcao = input.nextInt();

    if(opcao > 2 || opcao < 1){
        System.out.println("Opção Inválida ");
    } else {
        if(opcao == 2){
            System.out.println("Deseja encerrar o programa? (s/n)");
            aux = input.next().charAt(0);
            if(aux == 's' || aux == 'S'){
                System.out.println("Encerrando programa...");
                break;
            } else if (aux == 'n' || aux == 'N'){
                System.out.println("Voltando ao menu...");
            } else {
                System.out.println("Informe a opção iválida, voltando ao menu... ");
            }
        }
        switch(opcao){
            case 1:

            System.out.println("Qual o nível da poluição: ");
            A = input.nextDouble();

            poluicao(A);
            break;
        }
      }
    }while(true);
}

public void run(){
    menu();
}
}