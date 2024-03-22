package e13_mainParametros;

public class Inicio {

	public static void main(String[] args) {
		int nParametros = args.length;
		System.out.println("He recibido " + nParametros + " parámetros");
		if(nParametros > 0) {			
			System.out.println("Parámetros recibidos:");
			for(int i=0; i<nParametros; i++) {
				System.out.println("[" + i + "] -> " + args[i]);
			}
		}

	}

}
