package exercicio3;

public class fatorial {
	public static void main(String[] args) {
		int n =2;
		System.out.println("Fatorial de um numero qualquer: "+ n +" = "+ calcularFatorial(n));
		int[] numeros = {0,1,2,3,4,5,6};
		System.out.println("=================================================================");
		for(int numero: numeros) {
		System.out.println("Fatorial dos numeros de 0 a 6: "+ numero +" = "+ calcularFatorial(numero));
		}
	}
	public static int calcularFatorial(int n) {
		if (n == 0) {
		         return 1;
		    } else if(n < 0){ 
		          return n * calcularFatorial(n - 1);
		    }
		return 0;
	}
}
