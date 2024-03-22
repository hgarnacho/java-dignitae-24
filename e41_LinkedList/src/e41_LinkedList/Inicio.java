package e41_LinkedList;

import java.util.LinkedList;

public class Inicio {

	public static void main(String[] args) {
		// Crear una LinkedList
        LinkedList<String> ll = new LinkedList<>();

        // Agregar elementos a la LinkedList
        ll.add("Elemento 1");
        ll.add("Elemento 3");
        ll.add("Elemento 5");
        ll.add(1, "Elemento 2");
        ll.addFirst("Elemento 0");
        ll.addLast("Elemento 6");
        ll.set(1, "modificado");
        
        
        // Imprimir la LinkedList
        System.out.println("Contenido de la lista enlazada: " + ll);
        
        System.out.println("Elemento 3 se encuentra en la posición: " + ll.indexOf("Elemento 3"));

        // Obtener y modificar un elemento
        String elemento = ll.get(1); // Obtiene el segundo elemento
        System.out.println("Elemento en la posición 1: " + elemento);

        ll.set(1, "Nuevo Elemento"); // Modifica el segundo elemento
        System.out.println("Contenido de la lista enlazada después de modificar: " + ll);

        // Eliminar un elemento
        ll.remove(0); // Elimina el primer elemento
        System.out.println("Contenido de la lista enlazada después de eliminar: " + ll);

        // Tamaño de la LinkedList
        System.out.println("Tamaño de la lista enlazada: " + ll.size());

        // Verificar si la LinkedList está vacía
        System.out.println("¿La lista enlazada está vacía? " + ll.isEmpty());

	}

}
