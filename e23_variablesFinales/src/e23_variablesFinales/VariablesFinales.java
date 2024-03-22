package e23_variablesFinales;

public class VariablesFinales {
	  // Declaración de una variable final directamente
    final int CONSTANTE_1 = 100;

    // Declaración de una variable final en el constructor
    final int CONSTANTE_2;

    // Bloque de inicialización para asignar un valor a CONSTANTE_2
    {
        CONSTANTE_2 = 200;
    }

    // Método que utiliza una variable final
    void imprimirConstantesFinales() {
        System.out.println("CONSTANTE_1: " + CONSTANTE_1);
        System.out.println("CONSTANTE_2: " + CONSTANTE_2);
    }

    public static void main(String[] args) {
        VariablesFinales vf = new VariablesFinales();
        vf.imprimirConstantesFinales();
    }
}
