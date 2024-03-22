package e53_objetoMiembro;

public class Persona {
	
	private String nombre;
	private String apellidos; 
	private Direccion d;
	
	public Persona(String nombre, String apellidos, String calle, int numero) {		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.d = new Direccion(calle, numero);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + d.toString() + "]";
	}
			
}
