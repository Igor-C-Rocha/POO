import java.util.Scanner;

public class Questao11{

    public static void alunos(){
        Scanner input = new Scanner(System.in);
        int matricula, aux, total = 0, cont = 0;
        double media;

        System.out.println("Informe a matricula do aluno para sair digite 0: ");
        matricula = input.nextInt();

    while(matricula != 0){
        System.out.println("Informe a nota do aluno: ");
        aux = input.nextInt();

        total += aux;
        cont++;

        System.out.println("Informe a matricula do aluno para sair digite 0: ");
        matricula = input.nextInt();
    }

    if(cont != 0){
        media = total / cont;
        System.out.printf("A média da turma foi: %.2f\n", media);
    } else{
        System.out.println("Nehum aluno na escola\n");
    }
   }

    public void run(){
        alunos();
    }
}