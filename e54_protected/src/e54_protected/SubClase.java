package e54_protected;

public class SubClase extends SuperClase {

	public SubClase() {
		super();
		System.out.println("Construyendo objeto de la SubClase...");
		//Accedemos directamente al atributo protected de la superclase, lo estamos heredando
		atributoProtegido = 10;
	}
}
