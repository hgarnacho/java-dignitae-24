package e55_sobreescritura;

public class Inicio {

	public static void main(String[] args) {
		SuperClase objSuper = new SuperClase();
		SubClase objSub = new SubClase();
		
		objSub.metodo();
		objSuper.metodo();
	}

}
