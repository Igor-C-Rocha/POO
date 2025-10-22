package eleicao.sistema;

import eleicao.entidades.Voto;
import eleicao.interfaces.Candidato;
import java.util.List;
import java.util.ArrayList;

public class UrnaEletronica{
   
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosRegistrados;

    public UrnaEletronica(){
        this.candidatosRegistrados = new ArrayList<>();
        this.votosRegistrados = new ArrayList<>();
    }

    public void registrarCadidato(Candidato novoCandidato){
        
        for(Candidato c : candidatosRegistrados){
            if(c.getnumeroCandidato() == novoCandidato.getnumeroCandidato()){
                System.out.println("Erro: número " + c.getnumeroCandidato() + " está em uso");
            return;
            }
        }
    candidatosRegistrados.add(novoCandidato);
        System.out.println("O candidato " + novoCandidato.getnumeroCandidato() + " foi registrado");
    }

    public void receberVoto(Voto voto){

        int Votado = voto.getnumeroCandidato();
        Candidato candidatoEncontrado = null;

        for(Candidato c : candidatosRegistrados){
            if(c.getnumeroCandidato() == Votado){
                candidatoEncontrado = c;
                break;
            }
        }

        if(candidatoEncontrado != null){
            candidatoEncontrado.receberVoto();
            votosRegistrados.add(voto);
            System.out.println("Voto para o " + Votado + " foi confirmado");
        } else{
            System.out.println("Voto anulado, o candidato " + Votado + " não foi registrado");
        }
    }

    public void exibirResultado(){

        System.out.println("\n----------- RESULTADO ------------");
            
            for(Candidato c : candidatosRegistrados){
                c.exibirDados();
                int total = 0;
            for (Voto v : votosRegistrados){
                if (v.getnumeroCandidato() == c.getnumeroCandidato()){
                    total++;
                    }
                }
                System.out.println("Total de votos: " + total);
                System.out.println("----------------------------");
            }
        System.out.println("Votos computados: " + votosRegistrados.size());
    }

    public List<Candidato> getCandidatosRegistrados(){
        return candidatosRegistrados;
    }
}