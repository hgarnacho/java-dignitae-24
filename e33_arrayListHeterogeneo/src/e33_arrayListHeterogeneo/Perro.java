package e33_arrayListHeterogeneo;

public class Perro extends Animal {
	
	public Perro(String nombre) {
		super(nombre);
	}
	
	@Override
	public String saludar() {
		return "Guau!!!";
	}
	
	public String sacarPasear() {
		return "Estoy de paseo...";
	}

}
