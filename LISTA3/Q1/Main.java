package LISTA3.Q1;

public class Main{

public static void main(String[] args){

    VEICULO v = new VEICULO();
    v.marca = "Ford";
    v.modelo = "Focus FS";
    v.ano = 2015;
    v.preco = 70000.00;

    CAMINHAO c = new CAMINHAO();
    c.marca = "Volvo";
    c.modelo = "FH 540";
    c.ano = 2020;
    c.preco = 350000.00;
    c.capacidadeCarga = 30000.00;

    MOTO m = new MOTO();
    m.marca = "Hayabusa";
    m.modelo = "Suzuki GSX 1300R";
    m.ano = 2022;
    m.preco = 90000.00;
    m.cilindrada = 1300;

    System.out.println("Informações dos Veiculos:");

    System.out.println(v.exibirDetalhes());
    System.out.println(c.exibirDetalhes());
    System.out.println(m.exibirDetalhes());

    System.out.println("\nIPVA dos veiculos:");
    
    System.out.printf("IPVA do carro: R$ %.2f\n", v.calcularIpva());

    System.out.printf("IPVA do caminhao: R$ %.2f\n", c.calcularIpva());

    System.out.printf("IPVA da moto: R$ %.2f\n", m.calcularIpva());
    }
}