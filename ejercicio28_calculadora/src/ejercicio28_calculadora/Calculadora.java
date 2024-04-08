package ejercicio28_calculadora;

public class Calculadora {

	public int sumar(int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}
	
	public double sumar(double sumando1, double sumando2) {
		return sumando1 + sumando2;
	}
	
	public int[][] sumar(int[][] matriz1, int[][] matriz2){
		int[][] matrizResultado = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}			
		}
		return matrizResultado;
	}
	
	public String sumar(String cadena1, String cadena2) {
		return cadena1 + cadena2;
	}
	
}
