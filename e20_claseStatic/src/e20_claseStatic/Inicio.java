package e20_claseStatic;

import java.awt.Color;

public class Inicio {

	public static void main(String[] args) {		
		System.out.println(ColorStatic.ROJO);
		System.out.println(ColorStatic.VERDE);
		System.out.println(ColorStatic.AZUL);
		// Guardamos en un objeto de la clase Color (No ColorStatic) la mezcla de 2 colores
		//Le pasamos 2 atributos static de ColorStatic, que se inicia
		Color c = ColorStatic.mezclarColores(ColorStatic.ROJO, ColorStatic.AZUL); 
		System.out.println(c);		
	}

}
