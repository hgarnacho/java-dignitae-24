package e31_claseArrays;

import java.util.Arrays;

public class Inicio {

	public static void main(String[] args) {
		
		int[] numeros = {5, 3, 8, 1, 9};
        
        // Convertir el array en una cadena de caracteres
        System.out.println("Array como cadena: " + Arrays.toString(numeros));

        // Ordenar el array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Buscar un valor en el array
        int indice = Arrays.binarySearch(numeros, 8);
        System.out.println("El valor 8 está en el índice: " + indice);

        // Copiar el array
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia del array: " + Arrays.toString(copia));

        // Rellenar el array con un valor específico
        Arrays.fill(numeros, 10);
        System.out.println("Array rellenado: " + Arrays.toString(numeros));

	}

}
