package ejemplo;

public class Main {

	public static void main(String[] args) {		
		System.out.println("Suma naturales: " + sumaNaturales());
		System.out.println("Suma pares: " + sumaPares());
	}
	
	public static int sumaNaturales() {
		int acumulador = 0;
		for(int i=1; i<=10; i++ ) {
			acumulador += i; 
		}
		return acumulador;
	}
	
	public static int sumaPares() {
		int acumulador = 0;
		for(int i=0; i<=10; i+=2 ) {
			acumulador += i; 
		}
		return acumulador;
	}

	public static int sumaImpares() {
		int acumulador = 0;
		for(int i=1; i<=10; i+=2 ) {
			acumulador += i; 
		}
		return acumulador;
	}
	

}
