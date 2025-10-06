package LISTA3.Q3;

public class CURSO{

    public double cargaHoraria;
    public String nome;
    public String nivel;
    public String metodo;
    public double valor;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularDesconto(){
        return (valor * 0.10);
    }

    public String exibirInformacoes(){
        return "Nome: " + nome + "\nNivel: " + nivel + "\nCarga Horaria: " + cargaHoraria + "\nMétodo de Pagamento: " + metodo + "\nValor: " + valor;
    }
}