package e03_refactor;

public class Rectangulo {
	
	private int ancho;
	private int alto;	
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int calcularArea() {
		return ancho * alto;
	}

	public int calcularPerimetro() {
		return 2 * (ancho + alto);
	}

}