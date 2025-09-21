public class Questao1{

public static boolean verificaParidade(int n1){

return (n1 % 2) == 0;
}

public static boolean verificaPositivo(int n1){

return n1 > 0; // true ou false
}

public static boolean verificaNegativo(int n1){

return n1 < 0; // true ou false
}

public void run(){

 System.out.println("Para 10\n");
 System.out.println("Paridade: " + verificaParidade(10));
 System.out.println("Positivo: " + verificaPositivo(10));
 System.out.println("Negativo: " + verificaNegativo(10));

 System.out.println("\nPara 11\n");
 System.out.println("Paridade: " + verificaParidade(11));
 System.out.println("Positivo: " + verificaPositivo(11));
 System.out.println("Negativo: " + verificaNegativo(11));

 System.out.println("\nPara -1\n");
 System.out.println("Paridade: " + verificaParidade(-1));
 System.out.println("Positivo: " + verificaPositivo(-1));
 System.out.println("Negativo: " + verificaNegativo(-1));
 }
}