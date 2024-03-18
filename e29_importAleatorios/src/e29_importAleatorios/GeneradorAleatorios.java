package e29_importAleatorios;

import java.util.Random;

public class GeneradorAleatorios {

	private int max;
	
	public GeneradorAleatorios() {
		this.max = 10;
	}
	
	public GeneradorAleatorios(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public int generarAletorioInt() {
		Random r = new Random();
		return r.nextInt(this.max) + 1;		
	}
	
}
