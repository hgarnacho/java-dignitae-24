package e10_matrices;

public class Inicio {

	public static void main(String[] args) {
		// Declaración e inicialización de una matriz de enteros 
		// 3 filas y 3 columnas
		int[][] matriz1 = {
				{1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		};
		        
		//Otra forma de declarar una matriz
		int[][] matriz2 = new int[2][2];
		//Recorremos la matriz y asignamos un valor
		// 1 bucle anidado por cada dimensión
		//Ojo al bucle interno anidado (matriz2[i].length)
		int valorElementoMatriz = 1;
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = valorElementoMatriz;
			    valorElementoMatriz++;
		    }
		}

		// Imprimimos la matriz1 por consola
		System.out.println("Matriz1:");
		for (int i = 0; i < matriz1.length; i++) {
		    for (int j = 0; j < matriz1[i].length; j++) {
		    	System.out.print(matriz1[i][j] + " ");
		    }
		    System.out.println();
		}
		
		// Imprimimos la matriz2 por consola
		System.out.println("Matriz2:");
		for (int i = 0; i < matriz2.length; i++) {
		    for (int j = 0; j < matriz2[i].length; j++) {
		    	System.out.print(matriz2[i][j] + " ");
		    }
		    System.out.println();
		}
		        
		// Accedemos a un elemento concreto de la matriz1
		// Los índices o posiciones van de 0 a n-1
		int elemento = matriz1[1][2]; // Fila 1, Columna 2
		System.out.println("Elemento de Matriz1 en la fila 1, columna 2: " + elemento);
		        
		// Modificamos un elemento específico de la matriz
		matriz1[1][2] = 10;
		System.out.println("Matriz después de modificar elemento:");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
		    }
			System.out.println();
		}
	}

}
