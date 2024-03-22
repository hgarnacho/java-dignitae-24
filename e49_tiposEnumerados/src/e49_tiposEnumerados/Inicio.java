package e49_tiposEnumerados;

public class Inicio {
	
	private enum DiaSemana {
	    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}

	public static void main(String[] args) {
        // Uso de la enumeración
        DiaSemana dia = DiaSemana.LUNES;
        System.out.println("Hoy es: " + dia);

        // Se pueden comparar enumeraciones
        if (dia == DiaSemana.LUNES) {
            System.out.println("Es lunes.");
        }
        

	}

}
