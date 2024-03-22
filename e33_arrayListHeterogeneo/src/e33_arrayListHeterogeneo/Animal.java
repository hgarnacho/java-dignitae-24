package e33_arrayListHeterogeneo;

public abstract class Animal {
	
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String saludar();
	
}
