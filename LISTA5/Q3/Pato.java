package LISTA5.Q3;

public class Pato extends Animal implements Voador, Nadador{

    public Pato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("Dorgas");
    }

    @Override
    public void voar(){
        System.out.println("O " + nome + " estar voando alto");
    }

    @Override
    public void nadar(){
        System.out.println("O " + nome + " estar se afogando");
    }
}