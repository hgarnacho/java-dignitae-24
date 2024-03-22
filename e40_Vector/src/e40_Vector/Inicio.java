package e40_Vector;

import java.util.Vector;

public class Inicio {

	public static void main(String[] args) {
        // Crear un objeto de la clase Vector
        Vector<Integer> vector = new Vector<>();
        
        // Agregar elementos al vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.set(0, 11);
        
        // Mostrar el contenido del vector
        System.out.println("Contenido del vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Elemento " + (i+1) + ": " + vector.get(i));
        }
        
        // Calcular la suma de todos los elementos del vector
        int suma = 0;
        for (int i = 0; i < vector.size(); i++) {
            suma += vector.get(i);
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
        
        // Encontrar el valor máximo en el vector
        int maximo = vector.get(0);
        for (int i = 1; i < vector.size(); i++) {
            if (vector.get(i) > maximo) {
                maximo = vector.get(i);
            }
        }
        System.out.println("El valor máximo en el vector es: " + maximo);

	}

}
