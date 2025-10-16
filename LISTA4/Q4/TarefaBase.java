package LISTA4.Q4;

public abstract class TarefaBase{
    protected boolean concluida = false;

    public void marcarConcluida(){
        concluida = true;
        System.out.println("Tarefa concluída!");
    }

    public boolean isConcluida(){
        return concluida;
    }
}