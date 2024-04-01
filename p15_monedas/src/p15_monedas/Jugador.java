package p15_monedas;

public class Jugador {
	
	public static int tesoro;
	private String nombre;
	private int monedas;
		
	static {
		tesoro = 0;
	}

	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public String toString() {
		return this.nombre;
	}
	
	public void sumarMonedas(int cantidad) {
		this.monedas+=cantidad;
	}
	
	public void restarMonedas(int cantidad) {
		this.monedas-=cantidad;
	}
	
	public int getMonedas() {
		return this.monedas;
	}
	
	public static void sumarMonedasTesoro(int numeroMonedas) {
		tesoro+=numeroMonedas;
	}

	public static void restarMonedasTesoro(int numeroMonedas) {
		tesoro-=numeroMonedas;
	}

}


