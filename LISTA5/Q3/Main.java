package LISTA5.Q3;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        List<Animal> animais = new ArrayList<>();

        animais.add(new Gato("Cocaina"));
        animais.add(new Pomba("Pombinha"));
        animais.add(new Pato("Donald"));

        for(Animal animal : animais){
            animal.comer();
            animal.fazerSom();

            if(animal instanceof Voador){
                ((Voador) animal).voar();
            }
            if(animal instanceof Nadador){
                ((Nadador) animal).nadar();
            }
        }
    }
}