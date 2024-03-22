package e18_constructorCopiaAsignacion;

public class Inicio {

	public static void main(String[] args) {
		MiClase o1 = new MiClase(1);
		MiClase o2 = new MiClase(2);
		
		System.out.println("miAtributo en o1: " + o1.getMiAtributo());
		System.out.println("miAtributo en o2: " + o2.getMiAtributo());
		
		//Clonamos o1 en o3
		MiClase o3 = new MiClase(01);
		System.out.println("miAtributo en o3: " + o3.getMiAtributo());
		
		//Modificamos miAtributo en o3
		o3.setMiAtributo(3);
		//Comprobamos que o1 y o3 ocupan espacios de memoria distintos, y atributos distintos
		System.out.println("miAtributo en o1: " + o1.getMiAtributo());
		System.out.println("miAtributo en o3: " + o3.getMiAtributo());

		//Ahora asignamos a o4 el objeto o2
		MiClase o4 = o2;
		System.out.println("miAtributo en o2: " + o2.getMiAtributo());
		System.out.println("miAtributo en o4: " + o4.getMiAtributo());
		//Si modifico o2, estoy modificando o4
		o2.setMiAtributo(10);
		System.out.println("miAtributo en o2: " + o2.getMiAtributo());
		System.out.println("miAtributo en o4: " + o4.getMiAtributo());
	}

}
