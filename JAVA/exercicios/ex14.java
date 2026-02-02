package exercicios;

public class ex14 {

    // Imprime uma linha horizontal
    public static void imprimirLinha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Imprime a caixa usando imprimirLinha
    public static void imprimirCaixa(int largura, int altura) {
        // topo
        imprimirLinha(largura);

        // laterais
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < largura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // base (se a altura for maior que 1)
        if (altura > 1) {
            imprimirLinha(largura);
        }
    }

    public static void main(String[] args) {
        imprimirCaixa(10, 5);
    }
}
