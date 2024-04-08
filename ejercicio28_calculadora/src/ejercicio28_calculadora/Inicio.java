package ejercicio28_calculadora;

public class Inicio {

	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.sumar(2, 3));
		System.out.println(calc.sumar(2.5, 1.8));
	
		 int[][] matrix3 = new int[4][4];
	        matrix3 = calc.sumar(matrix1, matrix2);
	        System.out.println("La suma de las dos matrices es:");
	        for (int[] row : matrix1) {
	            // for each number in the row
	            for (int j : row) {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("+");
	        for (int[] row : matrix2) {
	            // for each number in the row
	            for (int j : row) {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("=");
	        for (int[] row : matrix3) {
	            // for each number in the row
	            for (int j : row) {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
		
	}

}
