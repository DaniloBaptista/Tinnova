package exercicio1;

public class main {
	public static void main(String[] args) {
		int totalEleitores = 1000;
		int votosvalidos = 800;
		int votosBrancos = 150;
		int votosNulos = 50;
		EleitoresVotos eleitoresVotos = new EleitoresVotos();
		System.out.println("Votos validos em reção ao total de eletores " + eleitoresVotos.percentualVotosValidosPorTotal(votosvalidos, totalEleitores) + "%");
		System.out.println("Votos brancos em relação ao total de eletores " + eleitoresVotos.percentualVotosBrancosPorTotal(votosBrancos, totalEleitores) + "%");
		System.out.println("Votos Nulos em relação ao total de eletores " + eleitoresVotos.percentualVotosNulosPorTotal(votosNulos, totalEleitores) + "%");

	}

}
