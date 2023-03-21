public class Main {
	public static void main(String[] args) {
	
	Sala quarto = new Sala(5, 10);
	Pessoa sam = new Pessoa(5, 2,quarto);
	// porta no 2, 10
	
	sam.andar("L", 3);
	sam.andar("U", 8);
	
	
	
	}
}
