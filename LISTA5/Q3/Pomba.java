package LISTA5.Q3;

public class Pomba extends Animal implements Voador{

    public Pomba(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("pão!!???");
    }

    @Override
    public void voar(){
        System.out.println("A " + nome + " estar voando baixo");
    }
}