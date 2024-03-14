package e04_gettersSetters;

public class Inicio {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("Luis");
		p.setApellidos("Gómez");
		
		System.out.println(p.getNombre() + " " + p.getApellidos());
		

	}

}
