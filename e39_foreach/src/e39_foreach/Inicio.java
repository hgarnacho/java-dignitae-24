package e39_foreach;

import java.util.ArrayList;

public class Inicio {

	public static void main(String[] args) {
		// Crear un ArrayList de Objetos Integer
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        // Iterar sobre los elementos del ArrayList
        System.out.println("Elementos en el ArrayList:");
        for (Integer numero : listaEnteros) {
            System.out.println(numero);
        }
	}
	
}
