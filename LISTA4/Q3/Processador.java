package LISTA4.Q3;

public class Processador implements IProcessador{
    
    @Override
    public void processar(String[] dados){

    System.out.println("Processando dados CSV...");

        for (int i = 0; i < dados.length; i++){
            System.out.println("Linha " + i + ": " + dados[i]);
        }
    }
}  