package e33_arrayListHeterogeneo;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String saludar() {
		return "Miau!";
	}
	
	public String dormir() {
		return "Zzzzzzzz...";
	}
	
}
