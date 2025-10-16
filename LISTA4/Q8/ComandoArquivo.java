package LISTA4.Q8;

public class ComandoArquivo implements IComando{

    @Override
    public void executar(String[] parametros){

        System.out.println("Executando Comando de Arquivo...");

        if (parametros != null && parametros.length > 0){
            System.out.println("Arquivos envolvidos:");
            for (String p : parametros){
                System.out.println(" - " + p);
            }
        }
    }
}