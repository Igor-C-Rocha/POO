package LISTA5.Q4;

public class SalaMidia{

    public void iniciarSessaoMusica(ReprodutorAudio dispositivo, String faixa){
        System.out.println("\nIniciando a sessão");
        dispositivo.tocarMusica(faixa);
    }

    public void iniciarSessaoFilme(ReprodutorVideo dispositivo, String filme){
        System.out.println("\nIniciando a sessão");
        dispositivo.tocarVideo(filme);
    }
}