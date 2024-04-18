package ejemplo_cadena_test;

public class Cadena {

	private String texto;
	
	public Cadena(String texto) {
		this.texto = texto; 
	}
	
	public String convertirMayuscula() {
		return this.texto.toUpperCase();
	}
	
}
