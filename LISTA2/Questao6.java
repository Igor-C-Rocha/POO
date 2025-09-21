public class Questao6{

public void impar(){

    System.out.println("ímpares: ");

    for(int i = 100; i <= 200; i++){
        if(i % 2 != 0){
            System.out.printf(" %d ", i);
        }
    }
    }

public void run(){
    impar();
    }
}