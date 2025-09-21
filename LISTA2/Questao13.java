public class Questao13{

    public static void multiplo(){
        
        for(int i = 1; i <= 100; i++){
            if(i % 10 == 0){
                System.out.printf("\n%d é múltiplo de 10 \n", i);
            }
        }
    }

    public void run(){
        multiplo();
    }
}