package p15_monedas;

import java.util.Random;

public class Cofre {
	
	public boolean vaciaMonedas() {
		Random r = new Random();
		return (r.nextInt(100)+1) <= 5;
	}
	
	public boolean restaMonedas() {
		Random r = new Random();
		return (r.nextInt(100)+1)<=10;
	}
	
	public int obtenerMonedas() {		
		Random r = new Random();		
		return r.nextInt(10)+1;
	}

}
