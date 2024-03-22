package e29_importAleatorio;

import java.util.Scanner;


public class Inicio {

	public static void main(String[] args) {
		GeneradorAleatorios g = new GeneradorAleatorios(100);
		
		Scanner s = new Scanner(System.in);

        // Solicitar al usuario que ingrese un entero
        System.out.print("¿Cuantos aleatorios quieres?: ");

        // Leer el entero ingresado por el usuario
        int na = s.nextInt();

        s.close();
        
        for(int i = 1; i<= na; i++) {
        	System.out.println(g.generarAleatorioInt());
        }        

	}

}
