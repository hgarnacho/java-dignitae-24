package e32_arrayList;

import java.util.ArrayList;

public class Inicio {

	public static void main(String[] args) {
		// Crear un ArrayList de cadenas de caracteres
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");
        listaNombres.set(1, "Javier");

        // Acceder a un elemento del ArrayList por su índice
        System.out.println("Elemento en la posición 1: " + listaNombres.get(1));
        

        // Iterar sobre los elementos del ArrayList
        System.out.println("Elementos en el ArrayList:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }

        // Obtener el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + listaNombres.size());

        // Verificar si un elemento está presente en el ArrayList
        System.out.println("¿María está presente en la lista? " + listaNombres.contains("María"));

        // Eliminar un elemento del ArrayList
        listaNombres.remove("Pedro");

        // Iterar nuevamente para mostrar los elementos después de la eliminación
        System.out.println("Elementos en el ArrayList después de eliminar a Pedro:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
	
}
