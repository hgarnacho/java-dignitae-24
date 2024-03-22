package e37_asignacionArrays;

public class Inicio {

	public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // Definición del primer array

        // Creación de una referencia al primer array
        int[] array2 = array1;

        // Modificación del primer elemento del segundo array
        // Estamos realmente modificando los 2!!!
        array2[0] = 10;

        // Imprimir el primer array
        System.out.println("Array1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Imprimir el segundo array
        System.out.println("Array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

	}

}
