import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Float> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<Float>();
    }

    public String nome() {
        return this.nome;
    }

    public void adicionaNota(float nota) {
        if (notas.size() < 3) {
            this.notas.add(nota);
        }
    }

    public float media() {
        if (notas.isEmpty()) {
            return 0.0f;
        }
        float soma = notas.stream().reduce(0.0f, (a, b) -> a + b);
        
        return soma / notas.size();
    }

    public String situacao() {
        float media = this.media();
        if (media < 3) {
            return "Reprovado";
        }
        if (media >= 3 && media < 7) {
            return "Recuperação";
        }
        return "Aprovado";
    }
}