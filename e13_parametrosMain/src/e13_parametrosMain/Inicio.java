package e13_parametrosMain;

public class Inicio {

	public static void main(String[] args) {
		int nParametros = args.length;
		System.out.println("He recibido " + nParametros + " parámetros");
		
		for(int i=0; i<nParametros; i++) {
			System.out.println("[" + args[i] + "]" );
		}
	}

}
