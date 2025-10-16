package LISTA4.Q10;

public class TransferenciaHTTP implements ITransferencia{

    @Override
    public void iniciarDownload(int tamanhoTotal){
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download HTTP...");

        while (bytesRecebidos < tamanhoTotal && continuar){
            bytesRecebidos += 10;

            System.out.println("Progresso: " + bytesRecebidos + "/" + tamanhoTotal + " bytes");

            if (bytesRecebidos >= tamanhoTotal / 2){
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        if (bytesRecebidos >= tamanhoTotal){
            System.out.println("Download Completo!");
        } else{
            System.out.println("Download Pausado!");
        }
    }
}