package e56_excepciones;

public class Inicio {
	
    public static void main(String[] args) {
        try {
            // Intentamos ejecutar código que puede lanzar una excepción
            int resultado = dividir(10, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción ArithmeticException
            System.out.println("Error: división por cero (" + e.getMessage() + ")");
        } finally {
            // Bloque finally: se ejecuta siempre, independientemente de si se lanzó una excepción o no
            System.out.println("Fin del programa");
        }
    }

    public static int dividir(int numerador, int denominador) {
        // Lanzamos una excepción si el denominador es cero
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return numerador / denominador;
    }

}
