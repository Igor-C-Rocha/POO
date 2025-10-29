package LISTA5.Q3;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("miau miau niggar");
    }
}