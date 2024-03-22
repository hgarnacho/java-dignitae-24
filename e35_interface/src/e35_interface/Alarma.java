package e35_interface;

public class Alarma implements PuedeSonar {

	private int volumen;
	
	public Alarma() {
		this.volumen = 0;
	}
	
	public Alarma(int volumen) {
		this.volumen = volumen;
	} 
	
	@Override
	public void sonar() {
		System.out.println("Soy una alarma y estoy sonando!!!");
	}

	@Override
	public void setVolumen(int volumen) {		
		this.volumen= volumen;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

}
