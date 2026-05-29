package tarefas;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    // ADICIONE ESTE BLOCO AQUI EMBAIXO:
    @Override
    public String toString() {
        return descricao;
    }
}