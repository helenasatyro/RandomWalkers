import java.util.Arrays;

public class Pessoa {
	private int posicaoY;
	private int posicaoX;
	private Sala sala;
	private String nome;
	
	public Pessoa( Sala sala, String nome, int X, int Y) {
		this.posicaoY = Y;
		this.posicaoX = X;
		this.sala = sala;
		this.nome = nome;
		this.andar(1, 0);
		
	}
	
	public Pessoa(Sala sala, String nome) {
		this.sala = sala;
		this.posicaoY = sala.eixoY() / 2;
		this.posicaoX = sala.eixoX() / 2;
		this.nome = nome;
		
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
	
	
	public void andar(int dir, int passos) {
		
		if (dir == 0) {
			this.posicaoX += passos;
			
		} else if (dir == 1) {
			this.posicaoX -= passos;
		} else if (dir == 2) {
			this.posicaoY += passos;
		} else if (dir == 3) {
			this.posicaoY -= passos;
		}
		
		normalizarPosicao();
		this.sala.celulasPercorridas()[posicaoX -1][posicaoY -1] += 1;
		
		System.out.println(this);	
	}
	
	public String toString() {
	
		String salaAtual = "\n";
		
		for (int i = 0; i < this.sala.eixoX(); i++) {
			for (int j = 0; j < this.sala.eixoY(); j++) {
				if( i == posicaoX -1 && j == posicaoY -1) {
					salaAtual = salaAtual + 1 + " ";
				} else {
					salaAtual = salaAtual + 0 + " ";
				}
			}
			salaAtual += "\n";
		}
		salaAtual += "\n>> " + nome + " está em (" + this.posicaoX + ", " + this.posicaoY + ")";
		return salaAtual;
	}
	
	public void andar(int dir) {
		andar(dir, 1);
	}
	
	
}
	
