package e23_variablesFinales;

public class VariablesFinales {

	final int CONSTANTE_1 = 100;
	
	final int CONSTANTE_2;
	
	{
		CONSTANTE_2 = 101;
	}

	void imprimirVariablesfinales() {
		System.out.println("CONSTANTE_1: " + this.CONSTANTE_1);
		System.out.println("CONSTANTE_2: " + this.CONSTANTE_2);
	}
		
}
