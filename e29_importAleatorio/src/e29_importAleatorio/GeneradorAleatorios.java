package e29_importAleatorio;

import java.util.Random;

public class GeneradorAleatorios {
	public GeneradorAleatorios(int max) {		
		this.max = max;
	}

	private int max;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public int generarAleatorioInt() {
		Random r = new Random();
		//Retornamos aleatorio entre 1 y 100
		return r.nextInt(this.max) +1;
	}

	
	
}
