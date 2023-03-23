import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
	
		Random rand = new Random();
	
		Sala quarto = new Sala(2, 2);
		Pessoa p1 = new Pessoa(quarto, "p1");
		Pessoa p2 = new Pessoa(quarto, "p2");
		// porta no 2, 10
		int contador = 0;
	
		while (quarto.intocadas() != 0) {
			contador++;
			p1.andar(rand.nextInt(4));
			p2.andar(rand.nextInt(4));
			System.out.println(quarto);
		}
	
	}
}
