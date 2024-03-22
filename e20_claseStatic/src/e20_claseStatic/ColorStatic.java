package e20_claseStatic;

import java.awt.Color;

public class ColorStatic {
	// Definición de colores estáticos
    public static final Color ROJO = new Color(255, 0, 0);
    public static final Color VERDE = new Color(0, 255, 0);
    public static final Color AZUL = new Color(0, 0, 255);
    public static final Color AMARILLO = new Color(255, 255, 0);
    public static final Color NARANJA = new Color(255, 165, 0);

    // Constructor privado para evitar instanciación
    /*private ColorStatic() {
        // Este constructor está vacío para evitar la creación de instancias de la clase.
    }*/
    
    public static Color mezclarColores(Color c1, Color c2) {
        // Obtener los componentes RGB de cada color
        int r1 = c1.getRed();
        int g1 = c1.getGreen();
        int b1 = c1.getBlue();
        
        int r2 = c2.getRed();
        int g2 = c2.getGreen();
        int b2 = c2.getBlue();
        
        // Calcular los nuevos componentes RGB mezclando los valores de los colores originales
        int r = (r1 + r2) / 2;
        int g = (g1 + g2) / 2;
        int b = (b1 + b2) / 2;
        
        // Crear y devolver el nuevo color mezclado
        return new Color(r, g, b);
    }
    
    
}
