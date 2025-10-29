package LISTA5.Q4;

public class SmartTV implements ReprodutorAudio, ReprodutorVideo{

    @Override
    public void tocarMusica(String faixa){
        System.out.printf("TV tocando: \n" + faixa);
    }

    @Override
    public void tocarVideo(String filme){
        System.out.printf("TV exibindo: \n" + filme);
    }
}