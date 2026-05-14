import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String titulo, String descricao) {
        this.tarefas.add(new Tarefa(titulo, descricao));
    }

    public List<Tarefa> listarTarefas() {
        return this.tarefas;
    }

    public boolean concluirTarefa(String titulo) {
        Tarefa tarefa = buscarPorTitulo(titulo);

        if (tarefa == null) {
            return false;
        }

        tarefa.concluir();
        return true;
    }

    public boolean removerTarefa(String titulo) {
        Tarefa tarefa = buscarPorTitulo(titulo);

        if (tarefa == null) {
            return false;
        }

        return this.tarefas.remove(tarefa);
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }

    public int contarPendentes() {
        int quantidade = 0;

        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.concluida()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    private Tarefa buscarPorTitulo(String titulo) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.titulo().equalsIgnoreCase(titulo)) {
                return tarefa;
            }
        }

        return null;
    }
}
