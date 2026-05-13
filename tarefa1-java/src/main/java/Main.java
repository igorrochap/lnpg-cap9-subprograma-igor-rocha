import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useLocale(Locale.US);

        var alunos = lerAlunos();
        alunos.forEach(aluno -> lerNotas(aluno));
        var relatorio = new Relatorio(alunos);
        relatorio.executa();
    }

    private static List<Aluno> lerAlunos() {
        List<Aluno> alunos = new ArrayList<Aluno>();
        for (int i = 0; i < 5; i++) {
            alunos.add(lerAluno(i + 1));
        }

        return alunos;
    }

    private static Aluno lerAluno(int numero) {
        System.out.printf("Informe o nome do %dº aluno: ", numero);
        String nome = sc.nextLine();

        return new Aluno(nome);
    }

    private static void lerNotas(Aluno aluno) {
        System.out.printf("Informe as 3 notas (separadas por espaço) de %s: ", aluno.nome());
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        sc.nextLine();

        aluno.adicionaNota(nota1);
        aluno.adicionaNota(nota2);
        aluno.adicionaNota(nota3);
    }
}
