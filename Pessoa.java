public class Pessoa {
	private int posicaoY;
	private int posicaoX;
	private Sala sala;
	
	public Pessoa(int X, int Y, Sala sala) {
		this.posicaoY = Y;
		this.posicaoX = X;
		this.sala = sala;
		
		System.out.println(this.sala);
		System.out.println(this);
		
	}
	
	public Pessoa(Sala sala) {
		this.sala = sala;
		this.posicaoY = sala.eixoY() / 2;
		this.posicaoX = sala.eixoX();
		
		System.out.println(this.sala);
		System.out.println(this);
		
	}
	
	public void normalizarPosicao() {
		if (this.posicaoY > this.sala.eixoY()) {
			this.posicaoY = this.sala.eixoY() - (this.posicaoY - this.sala.eixoY());
		} else if (this.posicaoX > this.sala.eixoX()) {
			this.posicaoX = this.sala.eixoX() - (this.posicaoX - this.sala.eixoX());
		} else if (this.posicaoX < 0) {
			this.posicaoX = -1 * posicaoX;
		} else if (this.posicaoY < 0) {
			this.posicaoY = -1 * posicaoY;
		} else { 
		return; // foi verificado que nada está errado, encerra a função
		}
		// System.out.println("voltou");
		normalizarPosicao(); // caso tenha havido algum erro, chama a função novamente para verificar de novo
		
	}
	
	
	public void andar(String dir, int passos) {

		
		if (dir.equals("R")) {
			this.posicaoX += passos;
			
		} else if (dir.equals("L")) {
			this.posicaoX -= passos;
		} else if (dir.equals("U")) {
			this.posicaoY += passos;
		} else if (dir.equals("D")) {
			this.posicaoY -= passos;
		}
		
		normalizarPosicao();
		System.out.println( "Você está em ("
					+ this.posicaoX + ", " + this.posicaoY + ")");
		
	}
	
	public void andar(String dir) {
		andar(dir, 1);
	}
	
	public String toString() {
		return ("Você está em ("
					+ this.posicaoX + ", " + this.posicaoY + ")");
	}
}
	
