package e20_claseStatic;

import java.awt.Color;

public class Inicio {

	public static int a;
	
	{
		a = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(ColorStatic.ROJO);
		System.out.println(ColorStatic.VERDE);
		System.out.println(ColorStatic.AZUL);
		
		Color c = ColorStatic.mezclarColores(ColorStatic.ROJO, ColorStatic.AZUL);
		System.out.println(c);
		
		ColorStatic c2 = new ColorStatic();
		System.out.println(c2.AMARILLO);
		
		System.out.println(ColorStatic.AMARILLO);
		
	}

}
