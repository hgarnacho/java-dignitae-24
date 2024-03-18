package e29_importAleatorios;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		GeneradorAleatorios dado = new GeneradorAleatorios(6);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Cuántos aleatorios quieres?: ");
		
		int numeroAleatorios = s.nextInt();
		
		s.close();
		
		for(int i = 1; i <= numeroAleatorios; i++) {
			System.out.println("Tirada [" + i + "] ==> " + dado.generarAletorioInt());
		}
		
	}

}
