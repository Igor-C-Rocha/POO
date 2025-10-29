package LISTA5.Q1;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] agrs){
        List<Forma> formas = new ArrayList<>();

        formas.add(new Retangulo(5, 2));
        formas.add(new Circulo(8));

        for(Forma f : formas){
            f.exibirNome();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());
        }
    }
}