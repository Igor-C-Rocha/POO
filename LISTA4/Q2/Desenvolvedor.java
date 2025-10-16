package LISTA4.Q2;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, int codigoCargo){
        super(nome, codigoCargo);
    }

    @Override
    public double calcularBonificacao(double salarioBase){
        double bonus;

    switch(codigoCargo){
        case 1:
            bonus = salarioBase * 0.10; 
        break;
        case 2:
            bonus = salarioBase * 0.15; 
        break;
        case 3:
            bonus = salarioBase * 0.20; 
        break;
        default:
            bonus = salarioBase * 0.05; 
        }
    return bonus;
    }
}