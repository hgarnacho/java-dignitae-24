package e54_protected;

public class OtraClase {
	
	private SuperClase sc;
	
	public OtraClase() {
		//Accedemos directamente al atributo protegido desde una clase en el mismo paquete
		//Es como si fuera público.
		sc = new SuperClase();
		sc.atributoProtegido  = 10;
	}
	
}
