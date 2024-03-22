package e03_refactor;

public class Inicio {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.setAlto(50);
		r.setAncho(100);
		System.out.println("El perímetro del rectángulo es: " + r.calcularPerimetro());
		System.out.println("El área del rectángulo es: " + r.calcularArea());
		//Esto es incorrecto, son privados!!
		//r.alto=10;
		//r.ancho=40;
		
	}

}
