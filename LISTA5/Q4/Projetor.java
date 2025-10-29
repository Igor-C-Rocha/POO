package LISTA5.Q4;

public class Projetor implements ReprodutorVideo{

    @Override
    public void tocarVideo(String filme){
        System.out.printf("Exibindo \n" + filme);
    }
}