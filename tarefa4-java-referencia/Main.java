class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        var produto = new Produto("Carregador", 20.65);
        
        System.out.printf("Preço antes: %.2f\n", produto.preco);
        aplicarDesconto(produto);
        System.out.printf("Preço depois: %.2f\n", produto.preco);
    }

    public static void aplicarDesconto(Produto p) {
        p.preco = 14.22;
    }
}