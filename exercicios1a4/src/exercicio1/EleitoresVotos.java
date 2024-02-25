package exercicio1;

public class EleitoresVotos {
	private int totalEleitores;
	private int votosvalidos;
	private int votosBrancos;
	private int votosNulos;
	
	
	public EleitoresVotos() {
		super();
	}


	public double percentualVotosValidosPorTotal(int votosValidos, int totalEleitores) {
		return  ((double) votosValidos/ totalEleitores) * 100;
	}
	public double percentualVotosBrancosPorTotal(int votosBrancos, int totalEleitores) {
		return  ((double) votosBrancos/ totalEleitores) * 100;
	}
	public double percentualVotosNulosPorTotal(int votosNulos, int totalEleitores) {
		return  ((double) votosNulos/ totalEleitores) * 100;
	}
	
}
