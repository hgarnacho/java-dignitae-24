package e21_constructorDefectoPrivado;

public class Inicio {

	public static void main(String[] args) {
		//No podremos crear objetos por defecto
		//La siguiente linea dará error en compilación
		//MiClase o = new MiClase();
		//Pero sí usando los otros constructores
		MiClase o2 = new MiClase(1);
		System.out.println(o2.getMiAtributo());
	}

}
