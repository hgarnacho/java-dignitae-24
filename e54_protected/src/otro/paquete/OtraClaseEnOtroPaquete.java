package otro.paquete;

import e54_protected.SuperClase;

public class OtraClaseEnOtroPaquete {

	private SuperClase sc;
	
	public OtraClaseEnOtroPaquete () {
		sc = new SuperClase();
		//Esto dará error
		//sc.atributoProtegido
	}
	
}
