package eleicao;

import eleicao.entidades.*;
import eleicao.sistema.UrnaEletronica;

public class Main{
    
    public static void main(String[] args){

        UrnaEletronica urna = new UrnaEletronica();
        
        Partido partidoA = new Partido("Partido da Esrença", "PE");
        Partido partidoB = new Partido("Partido do Progresso", "PP");

        Prefeito prefeito1 = new Prefeito("Maria", partidoA, 10);
        Prefeito prefeito2 = new Prefeito("João", partidoB, 20);
        Vereador vereador1 = new Vereador("Carlos", partidoA, 101);
        Vereador vereador2 = new Vereador("Ana", partidoB, 102);
        
        urna.registrarCadidato(prefeito1);
        urna.registrarCadidato(prefeito2);
        urna.registrarCadidato(vereador1);
        urna.registrarCadidato(vereador2);

        Eleitor e1 = new Eleitor("Pedro");
        Eleitor e2 = new Eleitor("Lucas");
        Eleitor e3 = new Eleitor("Mariana");
        Eleitor e4 = new Eleitor("Carla");
        Eleitor e5 = new Eleitor("Rafael");

        urna.receberVoto(new Voto(e1, 10));
        urna.receberVoto(new Voto(e2, 101));
        urna.receberVoto(new Voto(e3, 10));
        urna.receberVoto(new Voto(e4, 202));
        urna.receberVoto(new Voto(e5, 99));

        urna.exibirResultado();
    }
}