package Poo;

import java.util.Scanner;

public class Lista1java{

// Primeria parte

    public static void questao1(){
        Scanner input = new Scanner(System.in);
        int Max, Min;
        double Media;

        System.out.println("Informe a quantidade minima: ");
            Min = input.nextInt();
        System.out.println("Informe a quantidade maxima: ");
            Max = input.nextInt();

        Media = ((Min + Max)/2);
        System.out.printf("A media do estoque é: %.2f\n", Media);
    }

    public static void questao2(){
        Scanner input = new Scanner(System.in);
        double Real, Dolar, Cota;

        System.out.println("Informe a cotação do dolar: ");
            Cota = input.nextDouble();
        System.out.println("Informe o valor em dólar: ");
            Dolar = input.nextDouble();

        Real = (Cota * Dolar);
        System.out.printf("O valor em real é %.2f\n", Real);
    }

    public static void questao3(){
        Scanner input = new Scanner(System.in);
        int Codigo, QVendida;
        double Perco, Comissao, Total;
        String Nome;

        System.out.println("Informe o nome do funcionário: ");
            Nome = input.nextLine();
        System.out.println("Informe o código da peça: ");
            Codigo = input.nextInt();
        System.out.println("Informe o valor unitário: ");
            Perco = input.nextDouble();
        System.out.println("Qual a quantidade vendida: ");
            QVendida = input.nextInt();

        Total = (Perco * QVendida);
        Comissao = (0.05 * Total);

        System.out.println("\n--- Relatório da Venda ---");
        System.out.printf("Vendedor: %s\n", Nome);
        System.out.printf("Código da Peça: %d\n", Codigo);
        System.out.printf("Total da Venda: R$ %.2f\n", Total);
        System.out.printf("Comissão do funcionario é: %.2f\n", Comissao);
    }

    public static void questao4(){
        Scanner input = new Scanner(System.in);
        int A,B,C,D;

        System.out.println("Primeiro valor: ");
            A = input.nextInt();
        System.out.println("Segundo valor: ");
            B = input.nextInt();
        System.out.println("Terceiro valor: ");
            C = input.nextInt();
        System.out.println("Quarto valor: ");
            D = input.nextInt();
        
        System.out.println("--- Somas ---");
        System.out.printf("A com B: %d\n", A + B);
        System.out.printf("A com C: %d\n", A + C);
        System.out.printf("A com D: %d\n", A + D);
        System.out.printf("B com C: %d\n", B + C);
        System.out.printf("B com D: %d\n", B + D);
        System.out.printf("C com D: %d\n", C + D);

        System.out.println("--- Multiplicação ---");
        System.out.printf("A com B: %d\n", A * B);
        System.out.printf("A com C: %d\n", A * C);
        System.out.printf("A com D: %d\n", A * D);
        System.out.printf("B com C: %d\n", B * C);
        System.out.printf("B com D: %d\n", B * D);
        System.out.printf("C com D: %d\n", C * D);
    }

    public static void questao5(){
        Scanner input = new Scanner(System.in);
        double Velocidade, Tempo, Distancia, LiUsado;

        System.out.println("Quanto tempo de viagem: ");
            Tempo = input.nextDouble();
        System.out.println("Qual sua velocidade média: ");
            Velocidade = input.nextDouble();

        Distancia = (Tempo * Velocidade);
        LiUsado = (Distancia / 12);
        
        System.out.printf("O tempo de viagem foi: %.2f\n", Tempo);
        System.out.printf("Velocidade média foi: %.2f\n", Velocidade);
        System.out.printf("Distancia foi: %.2f\n", Distancia);
        System.out.printf("Combustível usado foi: %.2f\n", LiUsado);
    }

    public static void questao6(){
        Scanner input = new Scanner(System.in);
        double F, C;

        System.out.println("Qual a temperatura em Celsius: ");
            C = input.nextDouble();
        
        F = ((9 * C + 160)/5);

        System.out.printf("A temperatura em Fahrenhei é %.2f\n", F);
    }

    public static void questao7(){
        Scanner input = new Scanner(System.in);
        double F, C;

        System.out.println("Qual a temperatura em Fahrenhei: ");
            F = input.nextDouble();

        C = ((F - 32) * 5 / 9);

        System.out.printf("A temperatura em Celsius é %.2f\n", C);
    }

    public static void questao8(){
        Scanner input = new Scanner(System.in);
        double Raio, Altura, Volume;

        System.out.println("Qual a altura: ");
            Altura = input.nextDouble();
        System.out.println("Qual o Raio: ");
            Raio = input.nextDouble();
        
        Volume = (3.14159 * (Raio * Raio) * Altura);

        System.out.printf("O volume é: %.2f\n", Volume);
    }

    public static void questao9(){
        Scanner input = new Scanner(System.in);
        int Anos, Meses, Dias, DTotais;

        System.out.println("Informe os anos: ");
            Anos = input.nextInt();
        System.out.println("Informe os meses: ");
            Meses = input.nextInt();
        System.out.println("Informe os dias: ");
            Dias = input.nextInt();

        DTotais = ((Anos * 365) + (Meses * 30) + Dias);

        System.out.printf("Você vivel, Anos: %d; Meses: %d; Dias: %d.\n", Anos, Meses, Dias);
        System.out.printf("Total de dias: %d\n", DTotais);
    }

    public static void questao10(){
        Scanner input = new Scanner(System.in);
        int V1, V2;

        System.out.println("Qual o primeiro valor: ");
            V1 = input.nextInt();
        System.out.println("Qual o segundo valor: ");
            V2 = input.nextInt();

        if(V1 == V2){
            System.out.println("São iguais");
        }
        if(V1 != V2){
            System.out.println("São diferentes");
        }
        if(V1 > V2){
            System.out.printf("%d é maior que %d\n", V1, V2);
        }
        if(V1 < V2){
            System.out.printf("%d é menor que %d\n", V1, V2);
        }
        if(V1 >= V2){
            System.out.printf("%d é maior ou igual a %d\n", V1, V2);
        }
        if(V1 <= V2){
            System.out.printf("%d é menor ou igual a %d\n", V1, V2);
        }

// Segunda parte
    }

    public static void main(String[] args){

// Primeira parte

        questao1();
        questao2();
        questao3();
        questao4();
        questao5();
        questao6();
        questao7();
        questao8();
        questao9();
        questao10();

// Segunda parte
    }
}