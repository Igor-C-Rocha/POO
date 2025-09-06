package Poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;


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
    }

// Segunda parte

    public static void questao11(){
        Scanner input = new Scanner(System.in);
        int V1, V2, AUX;

        System.out.println("Qual o primeiro valor: ");
            V1 = input.nextInt();
        System.out.println("Qual o segundo valor: ");
            V2 = input.nextInt();
        
        System.out.printf("Valores antes da troca: %d, %d\n", V1, V2);

        AUX = V1;
        V1 = V2;
        V2 = AUX;

        System.out.printf("Valores depois da troca: %d, %d\n", V1, V2);
    }

    public static void questao12(){
        Scanner input = new Scanner(System.in);
        int Valor;

        System.out.println("Informe o valor: ");
            Valor = input.nextInt();
        
        if(Valor >= 0){
            System.out.printf("O módulo do valor %d é ele mesmo\n", Valor, Valor);
        } else{
            System.out.printf("O módulo do valor %d é: %d\n", Valor, Valor * (-1));
        }
    }

    public static void questao13(){
        Scanner input = new Scanner(System.in);
        int Valor;
        ArrayList<Integer> Valores;
        Valores = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            System.out.printf("Informe o %d° valor:\n ", i);
                Valor = input.nextInt();
                Valores.add(Valor);
        }

        Collections.sort(Valores);
            System.out.println("Valores crescente: \n" + Valores);
        Collections.reverse(Valores);
            System.out.println("Valores decresente: \n" + Valores);
    }

    public static void questao14(){
        Scanner input = new Scanner(System.in);
        int V1, V2, AUX;

        System.out.println("Qual o primeiro número: ");
            V1 = input.nextInt();
        System.out.println("Qual o segundo número: ");
            V2 = input.nextInt();

        if(V1 > V2){
            AUX = (V1 - V2);
        } else {
            AUX = (V2 - V1);
        }
        System.out.printf("A diferença é: %d", AUX);
    }

    public static void questao15(){
        Scanner input = new Scanner(System.in);
        double NMedia, Media, Re, Nota1, Nota2, Nota3;

        System.out.println("Informe a 1° nota: ");
            Nota1 = input.nextDouble();
        System.out.println("Informe a 2° nota: ");
            Nota2 = input.nextDouble();
        System.out.println("Informe a 3° nota: ");
            Nota3 = input.nextDouble();

        Media = ((Nota1 + Nota2 + Nota3) / 3);
        
        if(Media >= 7){
            System.out.printf("""
                    \nAluno aprovado.
                    Média: %.2f 
                    \n""", Media);
        } else {
            System.out.println("Aluno na recuperação");
            System.out.println("Informe a nota da recuperação: ");
                Re = input.nextDouble();
                NMedia = Media + Re;
            if(NMedia >= 7){
                System.out.printf("""
                        \nAluno aprovado por recuperação
                        Média: %.2f 
                        \n""", NMedia);
            } else {
                System.out.printf("""
                    \nAluno reprovado
                    Média: %.2f
                    \n""", NMedia);
            }
        }
    }

    public static void questao16(){
        Scanner input = new Scanner(System.in);
        int Num1, Num2;

        System.out.println("Informe o valor: ");
            Num1 = input.nextInt();
        System.out.println("Informe o segundo valo: ");
            Num2 = input.nextInt();
        
        if(Num1 == Num2){
            System.out.println("De fato, esse valores são iguais");
        } else if(Num1 > Num2){
            System.out.println("Valor um é maior");
            } else {
                System.out.println("Valor dois é maior");
            }
    }

    public static void questao17(){
        Scanner input = new Scanner(System.in);
        int Valor;

        System.out.println("Informe o valor: ");

        try{
            Valor = input.nextInt();
            if(Valor >= 0 && Valor <= 9){
                System.out.println("Valor válido");
            } else if (Valor < 0 || Valor > 9){
                System.out.println("Valor inválido");
        }    
        } catch (InputMismatchException e){
            System.out.println("Erro");
        }   
    }

    public static void questao18(){
        Scanner input = new Scanner(System.in);
        int Codigo;

        System.out.println("Qual o valor do código: ");
        Codigo = input.nextInt();

        switch(Codigo){
            case 1:
                System.out.println("Valor 1");
                break;
            case 2:
                System.out.println("Valor 2");
                break;
            case 3:
                System.out.println("Valor 3");
                break;
            default:
                System.out.println("Código inválido");
        }
    }

    public static void questao19(){
        Scanner input = new Scanner(System.in);
        int A,B,C;

        System.out.println("informe o 1° valor: ");
            A = input.nextInt();
        System.out.println("informe o 2° valor: ");
            B = input.nextInt();
        System.out.println("informe o 3° valor: ");
            C = input.nextInt();
        
        if(A < B + C && C < A + B && B < C + A){
            if(A == B && B == C){
                System.out.println("O triângulo é equilátero");
            } else if (A == B || A == C || B == C){
                System.out.println("O triângulo é isósceles");
            } else{
                System.out.println("Não é um escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }

    public static void questao20(){
        Scanner input = new Scanner(System.in);
        int valor, menor, maior, multi, i = 1;
        double divisao;
        ArrayList<Integer> Valores;
        Valores = new ArrayList<>();
        
        while(Valores.size() < 3){
            System.out.printf("Informe o %d° valor: \n", i);
            valor = input.nextInt();
        if(valor <= 0){
            System.out.println("Valor invalido");
        } else {
            Valores.add(valor);
            i++;
        }
        }
        if(Valores.size() == 3){
            menor = Collections.min(Valores);
            maior = Collections.max(Valores);

            multi = (menor * maior);
            divisao = maior / menor;

        System.out.printf("Resultado da multiplicação do menor * maior: %d\n", multi);
        System.out.printf("Resultado da divisão do maior / menor: %.2f\n", divisao);
        }
    }

    public static void questao21(){
        Scanner input = new Scanner(System.in);
        int V;

        System.out.println("Informe o valor: ");
            V = input.nextInt();
        
        if(V <= 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }

    public static void questao22(){
        Scanner input = new Scanner(System.in);
        int AUX, A = 0, B = 0;

        System.out.println("Informe o valor: ");
            AUX = input.nextInt();

        if(AUX < 0){
            B = AUX; //negativo
        } else {
            A = AUX; //positivo
        }
        System.out.printf("""
                A: %d
                B: %d
                \n""", A, B);
    }

    public static void main(String[] args){

// Primeira parte

    //    questao1();
    //    questao2();
    //    questao3();
    //    questao4();
    //    questao5();
    //    questao6();
    //    questao7();
    //    questao8();
    //    questao9();
    //    questao10();

// Segunda parte

    //    questao11();
    //    questao12();
    //    questao13();
    //    questao14();
    //    questao15();
    //    questao16();
    //    questao17();
    //    questao18();
    //    questao19();
    //    questao20();
    //    questao21();
    //    questao22();
    }
}