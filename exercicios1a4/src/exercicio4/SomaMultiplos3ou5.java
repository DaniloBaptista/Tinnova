package exercicio4;

public class SomaMultiplos3ou5 {

	public static int calculoSomaMultiplos3ou5(int x) {
	    int soma = 0;
	    for (int i = 0; i < x; i++) {
	        if (i % 3 == 0 || i % 5 == 0) {
	            soma += i;
	        }
	    }
	    return soma;
	}
	
	public static void main(String[] args) {
	    // Exemplo de uso
	    int numeroX = 10;
	    int resultado = calculoSomaMultiplos3ou5(numeroX);
	    System.out.println("A soma dos múltiplos de 3 ou 5 até " + numeroX + " é: " + resultado);
	}
}
