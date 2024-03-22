package otropaquete;

import e54_protected.SuperClase;

public class OtraClaseEnOtroPaquete {
	
	SuperClase sc;
	
	public OtraClaseEnOtroPaquete() {
		sc = new SuperClase();
		//No podríamos acceder al atributo protegido ya que estamos en otro paquete
		//sc.atributoProtegido = 10;
		
	}
	
}
