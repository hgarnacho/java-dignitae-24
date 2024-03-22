package e35_interface;

public class Timbre implements PuedeSonar {

	private int volumen;
	
	@Override
	public void sonar() {
		System.out.println("Soy una alarma y estoy sonando!!!");
	}

	@Override
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

}
