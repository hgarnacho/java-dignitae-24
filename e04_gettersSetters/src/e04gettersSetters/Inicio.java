package e04gettersSetters;

public class Inicio {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Héctor");
		p.setApellidos("Garnacho");
		System.out.println(p.getNombre() + " " + p.getApellidos());

	}

}
