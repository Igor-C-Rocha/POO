package LISTA3.Q9;

public class LIVRO{

    public int anoPuplicacao;
    public String titulo;
    public double preco;
    public String autor;
    public double diasAtraso;
    public String tipo;

    public static void println(String string){
        System.out.println(string);
    }

    public double calcularMulta(){
        return 2.00;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String exibirInformacoes(){
        return "Titulo: " + titulo + "\nanoPublicacao: " + anoPuplicacao + "\nAutor: " + autor + "\nPreço: " + preco;
    }
}