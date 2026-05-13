import java.util.List;

public class Relatorio {
    private List<Aluno> alunos;

    public Relatorio(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void executa() {
        alunos.forEach(aluno -> 
            System.out.printf("Aluno: %s | Média: %.2f | Situação: %s\n", aluno.nome(), aluno.media(), aluno.situacao())
        );
    }
}