import java.util.Arrays;

public class Sala {
	private int eixoY;
	private int eixoX;
	private int[][] celulasPercorridas;
	
	public Sala(int X, int Y) {
		this.eixoY = Y;
		this.eixoX = X;
		this.celulasPercorridas = new int[X][Y];
		}
	
	
	public int eixoX() {
		return this.eixoX;
	}
	public int eixoY() {
		return this.eixoY;
	}
	
	public int[][] celulasPercorridas() {
		return this.celulasPercorridas;
	}
	
	public double intocadas() {
	
		int cont = 0;
		for (int i = 0; i < this.eixoX; i++) {
			for (int j = 0; j < this.eixoY; j++) {
				if (celulasPercorridas[i][j] == 0) {cont++;}
			}
		}
		return cont;
				
	}
	
	
	public String toString() {
	
		int cont = 0;
		
		String sala = "Esta sala tem " + this.eixoX() + " linhas e " 
					+ this.eixoY() + " colunas. \n";
							
		for (int i = 0; i < this.eixoX; i++) {
			for (int j = 0; j < this.eixoY; j++) {
				if (celulasPercorridas[i][j] == 0) {cont++;}
				sala += celulasPercorridas[i][j] + " ";
			}
			sala += "\n";
		}
		sala += cont + "/" + eixoY * eixoX + " intocadas.";
		
		return sala;
	}
}

