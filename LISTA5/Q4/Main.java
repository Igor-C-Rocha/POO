package LISTA5.Q4;

public class Main{

    public static void main(String[] args){

        CaixaSom caixa = new CaixaSom();
        Projetor projetor = new Projetor();
        SmartTV smartTV = new SmartTV();


        SalaMidia sala = new SalaMidia();

        sala.iniciarSessaoMusica(caixa, "Bohemian Rhapsody - Queen");
        sala.iniciarSessaoFilme(projetor, "Interestelar");
        sala.iniciarSessaoMusica(smartTV, "Imagine - John Lennon");
        sala.iniciarSessaoFilme(smartTV, "Matrix");
    }
}