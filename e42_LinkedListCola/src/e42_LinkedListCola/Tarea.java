package e42_LinkedListCola;

public class Tarea {	
	
	private int id;
	private String descripcion;
	
	public Tarea(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getId()).append(" - ").append(this.getDescripcion());
		return sb.toString();
	}
		
}
