package LISTA4.Q5;

public class ValidadorSeguranca extends ValidadorBase{

    @Override
    public void validarAcesso(String senha){
        if (senha.length() >= 8 && senha.contains("A")){
            System.out.println("Acesso OK");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}