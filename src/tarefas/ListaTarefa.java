package tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {

        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);

            }

                tarefaList.removeAll(tarefaParaRemover);

        }
    }
             public int obterNumeroDeTarefas(){
        return tarefaList.size();
             }
             public void obterDescricoesDeTarefas(){
                 System.out.println(tarefaList);
             }

    static void main() {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O Número total de tarefas é = " + listaTarefa.obterNumeroDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa de Maio");
        listaTarefa.adicionarTarefa("Tarefa de Junho");
        System.out.println("O Número total de tarefas é = " + listaTarefa.obterNumeroDeTarefas());

        listaTarefa.removerTarefa("Tarefa de Maio");
        System.out.println("O Número total de tarefas é = " + listaTarefa.obterNumeroDeTarefas());
        listaTarefa.obterDescricoesDeTarefas();


    }
}
