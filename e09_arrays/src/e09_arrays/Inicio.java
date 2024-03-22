package e09_arrays;

import java.util.Arrays;

public class Inicio {

    public static void main(String[] args) {
        // Declaración e inicialización de un array de enteros
        int[] numeros = new int[10]; // Un array de tamaño 10 
        
        // Inicializamos valores
        numeros[0] = 3;
        numeros[1] = 1;
        numeros[2] = 20;
        numeros[3] = 34;
        numeros[5] = 8;
        numeros[6] = 2;
        numeros[7] = 45;
        numeros[8] = 90;
        numeros[9] = 7;
        
        
        // Acceso a los elementos del array
        System.out.println("El valor en la posición 0 es: " + numeros[0]);
        System.out.println("El valor en la posición 2 es: " + numeros[2]);
        
        // Recorremos
        System.out.println("Recorremos array ...");
        for (int i = 0; i < numeros.length; i++) {        	
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }
        
        // Recorremos en orden inverso
        System.out.println("Recorremos en orden inverso ...");
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }
        
        // Inicializo otro array
        int[] numeros2 = {4, 2, 5, 9, 0, 8, 6, 7, 1, 3};
        //Clonamos en otro array
        int[] numeros3 = numeros2.clone();
        //Mostramos numeros3 usando toString de la clase Arrays
        System.out.println(Arrays.toString(numeros3));
                
    }

}
