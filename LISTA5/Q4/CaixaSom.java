package LISTA5.Q4;

public class CaixaSom implements ReprodutorAudio{

    @Override
    public void tocarMusica(String faixa){
        System.out.printf("Tocando: \n" + faixa);
    }
}