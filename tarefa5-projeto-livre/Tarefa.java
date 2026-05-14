public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String titulo() {
        return this.titulo;
    }

    public boolean concluida() {
        return this.concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    public String resumo() {
        String situacao = this.concluida ? "concluida" : "pendente";
        return String.format("%s - %s (%s)", this.titulo, this.descricao, situacao);
    }
}
