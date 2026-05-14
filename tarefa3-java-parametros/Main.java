public class Main {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("Antes: %d\n", x);
        alterarNumero(x);
        System.out.printf("Depois: %d\n", x);
    }

    public static void alterarNumero(int x) {
        x = 20;
        System.out.printf("Em alterarNumero: %d\n", x);
    }
}