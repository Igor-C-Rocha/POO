package LISTA3.Q7;

public class ESPORTE{

    public int numeroJogadores;
    public String nome;
    public double duracaoPartida;
    public double popularidade;
    public double tamanhoCampo;
    public double alturaCesto;

    public static void println(String string){
        System.out.println(string);
    }

    public double base(){
        return (500.00);
    }

    public String exibirInformacoesBasquete(){
        System.out.println("\n Esporte: Basquete ");
        return "\nNome: " + nome + "\nNumero de Jogadores: " + numeroJogadores + "\nDuração da Partida: " + duracaoPartida + "\nPopularidade: " + popularidade + "\nAltura do Cesto: " + alturaCesto;
    }

    public String exibirInformacoesFutebol(){
        System.out.println("\n Esporte: Futebol ");
        return "\nNome: " + nome + "\nNumero de Jogadores: " + numeroJogadores + "\nDuração da Partida: " + duracaoPartida + "\nPopularidade: " + popularidade + "\nTamanho do Campo: " + tamanhoCampo;
    }

    public String regrasBasquete(){
        return " O basquete é jogado por duas equipes de cinco jogadores cada.\n O objetivo é marcar pontos arremessando a bola na cesta do time adversário.\n A equipe com mais pontos ao final do jogo vence.";
    }

    public String regrasFutebol(){
        return " O futebol é jogado por duas equipes de onze jogadores cada.\n O objetivo é marcar gols chutando a bola para dentro do gol do time adversário.\n A equipe com mais gols ao final do jogo vence.";
    }
}