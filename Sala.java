

public class Sala {
	private int eixoY;
	private int eixoX;
	
	public Sala(int X, int Y) {
		this.eixoY = Y;
		this.eixoX = X;
	}
	
	public int eixoX() {
		return this.eixoX;
	}
	public int eixoY() {
		return this.eixoY;
	}
	
	
	public String toString() {
		return ("Esta sala tem " + this.eixoX() + " de largura Leste-Oeste e " 
					+ this.eixoY() + " de comprimento Norte-Sul.");
		}
}
