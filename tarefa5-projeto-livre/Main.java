import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        executarSistema(gerenciador);
    }

    private static void executarSistema(GerenciadorTarefas gerenciador) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();
            processarOpcao(opcao, gerenciador);
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("=== GERENCIAMENTO DE TAREFAS ===");
        System.out.println("1. Cadastrar tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Concluir tarefa");
        System.out.println("4. Remover tarefa");
        System.out.println("5. Mostrar resumo");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static int lerOpcao() {
        int opcao = SC.nextInt();
        SC.nextLine();
        return opcao;
    }

    private static void processarOpcao(int opcao, GerenciadorTarefas gerenciador) {
        switch (opcao) {
            case 1:
                cadastrarTarefa(gerenciador);
                break;
            case 2:
                listarTarefas(gerenciador);
                break;
            case 3:
                concluirTarefa(gerenciador);
                break;
            case 4:
                removerTarefa(gerenciador);
                break;
            case 5:
                mostrarResumo(gerenciador);
                break;
            case 0:
                System.out.println("Encerrando o sistema.");
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }

    private static void cadastrarTarefa(GerenciadorTarefas gerenciador) {
        System.out.print("Titulo da tarefa: ");
        String titulo = SC.nextLine();

        System.out.print("Descricao da tarefa: ");
        String descricao = SC.nextLine();

        gerenciador.adicionarTarefa(titulo, descricao);
        System.out.println("Tarefa cadastrada com sucesso.");
    }

    private static void listarTarefas(GerenciadorTarefas gerenciador) {
        List<Tarefa> tarefas = gerenciador.listarTarefas();

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.printf("%d. %s%n", i + 1, tarefa.resumo());
        }
    }

    private static void concluirTarefa(GerenciadorTarefas gerenciador) {
        System.out.print("Informe o titulo da tarefa a concluir: ");
        String titulo = SC.nextLine();

        boolean alterou = gerenciador.concluirTarefa(titulo);
        exibirResultadoOperacao(alterou, "Tarefa concluida.", "Tarefa nao encontrada.");
    }

    private static void removerTarefa(GerenciadorTarefas gerenciador) {
        System.out.print("Informe o titulo da tarefa a remover: ");
        String titulo = SC.nextLine();

        boolean removeu = gerenciador.removerTarefa(titulo);
        exibirResultadoOperacao(removeu, "Tarefa removida.", "Tarefa nao encontrada.");
    }

    private static void mostrarResumo(GerenciadorTarefas gerenciador) {
        int total = gerenciador.contarTarefas();
        int pendentes = gerenciador.contarPendentes();
        int concluidas = total - pendentes;

        System.out.println("Resumo do sistema:");
        System.out.printf("Total de tarefas: %d%n", total);
        System.out.printf("Tarefas pendentes: %d%n", pendentes);
        System.out.printf("Tarefas concluidas: %d%n", concluidas);
    }

    private static void exibirResultadoOperacao(boolean sucesso, String mensagemSucesso, String mensagemErro) {
        if (sucesso) {
            System.out.println(mensagemSucesso);
        } else {
            System.out.println(mensagemErro);
        }
    }
}
