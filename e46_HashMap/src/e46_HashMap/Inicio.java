package e46_HashMap;

import java.util.HashMap;

public class Inicio {

    public static void main(String[] args) {
        // Crear un HashMap
    	HashMap<String, String> m = new HashMap<>();

        // Agregar elementos al HashMap
        m.put("1234FDR", "Renault");
        m.put("7345XES", "Audi");
        m.put("9493LMV", "BMW");

        // Obtener el valor asociado a una clave
        String mm = m.get("1234FDR");
        System.out.println("Marca del coche con matrícula 1234FDR: " + mm);

        // Actualizar el valor asociado a una clave
        m.put("1234FDR", "Seat");
        System.out.println("Nueva marca para la matrícula 1234FDR: " + m.get("1234FDR"));

        // Verificar si una clave está presente en el HashMap
        System.out.println("¿El mapa contiene la clave '1234FDR'? " + m.containsKey("1234FDR"));

        // Eliminar un elemento del HashMap
        m.remove("1234FDR");
        System.out.println("Contenido del HashMap después de eliminar '1234FDR': " + m);

        // Tamaño del HashMap
        System.out.println("Tamaño del HashMap: " + m.size());
    }

}
