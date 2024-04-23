package ejercicio33_empresaApp;

public abstract class Empleados {
	
	private int id;
	private String nombre;
	private String apellidos;
	private final int SUELDO = 900;
	
	public Empleados(int id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getSueldo() {
		return SUELDO;
	}
	public abstract double obtenerSalario();
	
}