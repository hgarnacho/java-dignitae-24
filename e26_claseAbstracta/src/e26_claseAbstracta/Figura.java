package e26_claseAbstracta;

public abstract class Figura {
	
    // Método abstracto para calcular el área
	// No sabemos todavía cómo se calculará el area de cada figura 
    public abstract double calcularArea();

    // Método concreto para imprimir información sobre la figura
    public void mostrarInformacion() {
        System.out.println("Soy una figura.");
    }
		
}
