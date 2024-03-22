package e08_bucles;

public class EjemplosBucles {

	public void muestraPrimerosCincoWhile() {
        System.out.println("\nBucle while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("El valor de j es: " + j);
            j++;
        }
	}
	
	public void muestraPrimerosCincoDoWhile() {
        // Ejemplo de bucle do-while
        System.out.println("\nBucle do-while:");
        int k = 0;
        do {
            System.out.println("El valor de k es: " + k);
            k++;
        } while (k <= 5);
	}
	
	public void muestraPrimerosCincoFor() {
        // Ejemplo de bucle for
        System.out.println("\nBucle for:");
        for(int i = 1; i <= 5; i++){
            System.out.println("El valor de i es: " + i);
        } 
	}
	
}