package LISTA4.Q8;

public class ComandoRede implements IComando{

    @Override
    public void executar(String[] parametros){

        System.out.println("Executando Comando de Rede...");

        if (parametros != null && parametros.length > 0){
            System.out.println("Parâmetros de Rede:");
            for (String p : parametros){
                System.out.println(" - " + p);
            }
        }
    }
}