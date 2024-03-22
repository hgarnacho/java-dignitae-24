package e15_polimorfismo;

public class Inicio {

	 public static void main(String[] args) {
	     Animal a;

	     a = new Perro(); // Instancia de Perro
	     a.hacerSonido(); // Llamará al método hacerSonido() de la clase Perro

	     a = new Gato(); // Ahora instancia de Gato
	     a.hacerSonido(); // Llamará al método hacerSonido() de la clase Gato
	 }

}
