package e28_saludoParametrizado;

public class Inicio {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Debes enviar un único parámetro (nombre)");
		}else {
			String nombre = args[0];
			System.out.println("Hola" + nombre + "!!!");
		}
	}

}
