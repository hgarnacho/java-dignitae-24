package e07_clasesTipos;

public class ClasesTipos {

	private String s;
	private Integer i;
	
	public void pruebaString() {
		this.s = "Hola buenos días";
		System.out.println("Cadena inicial: " + this.s);
		System.out.println("Caracter en la posición 1: " + this.s.charAt(1));
		System.out.println("Longitud de la cadena: " + this.s.length());
		System.out.println("Reemplaza Hola por Adios: " + this.s.replace("Hola", "Adios"));
		System.out.println("Cadena repetida 10 veces: " + this.s.repeat(10));
		System.out.println("Cadena en mayúsculas: " + this.s.toUpperCase());		
		System.out.println("3 primeros caracteres de la cadena: " + this.s.substring(0,3));			
	}
	
	public void pruebaInteger() {
		this.i= 6;
		this.s="16";
		int a = 100;
		i= Integer.parseInt(this.s);		
		System.out.println("Convertir el string 16 a Integer: " + this.i);				
		System.out.println("17+28=" + Integer.sum(17, 28)); 
		System.out.println("Revertir a nivel de bit 10 (00000000000000000000000000001010) -> (11111111111111111111111111110101)= 1342177280: " + Integer.reverse(10));
		System.out.println("Máximo entre 10 y 11: " + Integer.max(this.i, a));
	}

}
