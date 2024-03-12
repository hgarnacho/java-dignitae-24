package e54_protected;

public class OtraClase {

	private SuperClase sc;
	
	public OtraClase () {
		this.sc = new SuperClase();
		sc.atributoProtegido = 20;
 	}
	
}
