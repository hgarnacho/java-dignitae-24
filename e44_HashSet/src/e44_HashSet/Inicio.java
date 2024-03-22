package e44_HashSet;

import java.util.HashSet;

public class Inicio {

	public static void main(String[] args) {
		// Crear un HashSet
        HashSet<String> conjunto = new HashSet<>();

        // Agregar elementos al HashSet
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

        // Mostrar el contenido del HashSet
        System.out.println("Contenido del HashSet: " + conjunto);

        // Verificar si un elemento está presente
        System.out.println("¿El conjunto contiene 'B'? " + conjunto.contains("B"));

        // Eliminar un elemento del HashSet
        conjunto.remove("A");
        System.out.println("Contenido del HashSet después de eliminar 'A': " + conjunto);

        // Verificar si el HashSet está vacío
        System.out.println("¿El HashSet está vacío? " + conjunto.isEmpty());

        // Tamaño del HashSet
        System.out.println("Tamaño del HashSet: " + conjunto.size());

        // Limpiar el HashSet
        conjunto.clear();
        System.out.println("Contenido del HashSet después de limpiar: " + conjunto);
	}

}
