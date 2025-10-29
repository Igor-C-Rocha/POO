package LISTA5.Q3;

public abstract class Animal{
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println(nome + " estar comendo :)");
    }

    public abstract void fazerSom();
}