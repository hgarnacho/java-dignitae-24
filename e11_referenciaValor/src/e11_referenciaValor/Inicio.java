package e11_referenciaValor;

public class Inicio {

	public static void main(String[] args) {
	   int i = 1;
	   modificarEntero(i);

	   Persona p = new Persona("Héctor");
	   modificarPersona(p);
	        
	   int[] a = {1, 2, 3, 4, 5};
	   modificarArray(a);
	      
	   System.out.println("variable (int) después de modificarEntero: " + i);
	   System.out.println("Objeto (Persona) después de modificarPersona: " + p.getNombre());
	   System.out.print("Array después de modificarArray: ");
	   imprimirArray(a);

	}

	public static void modificarEntero(int i) {
	    i = 2;
	}
	    
	public static void modificarPersona(Persona p) {
		p.setNombre("Unai");; 
	}
	    
	public static void modificarArray(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] *= 2; 
	    }
	}

	public static void imprimirArray(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
	        
}
