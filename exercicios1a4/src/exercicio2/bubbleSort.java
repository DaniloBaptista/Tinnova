package exercicio2;

public class bubbleSort {
	public static void main(String[] args) {
        int[] v = {5, 3, 2, 4, 7, 1, 0, 6};

        System.out.println("Vetor original:");
        exibirVetor(v);

        bubbleSortMetodo(v);

        System.out.println("\nVetor ordenado:");
        exibirVetor(v);
    }

    public static void bubbleSortMetodo(int[] vetor) {
        int n = vetor.length;
        boolean trocado;
        
        do {
            trocado = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    trocado = true;
                }
            }
            n--;
        } while (trocado);
    }

    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
