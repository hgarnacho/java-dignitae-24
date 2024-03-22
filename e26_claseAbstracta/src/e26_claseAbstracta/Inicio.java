package e26_claseAbstracta;

public class Inicio {

	public static void main(String[] args) {
		Circulo c = new Circulo(10);
		double area = c.calcularArea();
		System.out.printf("El área es: %.2f",area);

	}

}
