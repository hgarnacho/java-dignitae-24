package e57_excepciones;

import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        String input = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(input);
            System.out.println("El número introducido es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir el input a un número entero.");
        } finally {
            scanner.close();
        }
    }

}
