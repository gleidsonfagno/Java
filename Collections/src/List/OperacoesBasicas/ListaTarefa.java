package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionar(String descricao) {
        this.tarefaList.add( new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : this.tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public  void  obterDescricoesTarefas() {
        System.out.println("Todas as Tarefas: " + this.tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.printf("Tarefa: %s\n", listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionar("Descrição 1");
        listaTarefa.adicionar("Descrição 2");
        listaTarefa.adicionar("Descrição 3");
        System.out.printf("Tarefa: %s\n", listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Descrição 1");

        System.out.printf("Tarefa: %s\n", listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
