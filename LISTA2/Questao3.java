import java.util.Scanner;

public class Questao3{

public void homem(){
    double H;
    Scanner input = new Scanner(System.in);

System.out.println("Informe sua altura: ");
    H = input.nextDouble();

System.out.printf("Seu peso ideal é: %.2f\n", (72.7 * H) - 58);
    }

public void mulher(){
    double H;
    Scanner input = new Scanner(System.in);

System.out.println("Informe sua altura: ");
    H = input.nextDouble();

System.out.printf("Seu peso ideal é: %.2f\n", (62.1 * H) - 44);
    }

public void menu(){
    int aux;
    Scanner input = new Scanner(System.in);

    do{

    System.out.println("Digite 1 pra homen ou 2 pra mulher e 0 pra sair ");
    aux = input.nextInt();

    if(aux > 2 || aux < 0){
        System.out.println("Opção Inválida ");
    } else {
        if(aux == 0){
            System.out.println("Saindo ...");
            break;
        }

    switch(aux){
        case 1:
            homem();
        break;
        case 2:
            mulher();
        break;
    }
   }
  }while(true);
}

public void run(){
    menu();
 }
}