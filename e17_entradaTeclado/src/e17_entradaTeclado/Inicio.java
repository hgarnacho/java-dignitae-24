package e17_entradaTeclado;

import java.util.Scanner;

public class Inicio {

	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer entrada del teclado
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Por favor, ingrese su nombre: ");	        
	        String nombre = scanner.nextLine();
	        
	        System.out.print("Por favor, ingrese su edad: ");	        
	        int edad = scanner.nextInt();

	        System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años.");

	        // Cerrar el objeto Scanner para liberar recursos
	        scanner.close();
	 }

}
