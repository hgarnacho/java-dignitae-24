package e45_HashSetInterseccion;

import java.util.HashSet;

public class Inicio {

	public static void main(String[] args) {

        // Crear dos conjuntos de números enteros
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // Agregar elementos a los conjuntos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);

        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);

        // Calcular la intersección entre los conjuntos
        HashSet<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        // Mostrar la intersección
        System.out.println("Intersección entre conjunto1 y conjunto2: " + interseccion);
    }

}
