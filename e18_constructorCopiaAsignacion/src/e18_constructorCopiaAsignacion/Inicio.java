package e18_constructorCopiaAsignacion;

public class Inicio {

	public static void main(String[] args) {
		
		MiClase o1 = new MiClase(1);
		MiClase o2 = new MiClase(2);
		
		System.out.println("miAtributo en o1 vale: " + o1.getMiAtributo());
		System.out.println("miAtributo en o2 vale: " + o2.getMiAtributo());
		
		MiClase o3 = new MiClase(3);
		System.out.println("miAtributo en o3 vale: " + o3.getMiAtributo());	
		o3.setMiAtributo(30);
		System.out.println("miAtributo en o3 vale: " + o3.getMiAtributo());	
		
		//provocamos el error
		MiClase o4 = o2;
		System.out.println("miAtributo en o4 vale: " + o4.getMiAtributo());	
		o2.setMiAtributo(17);
		System.out.println("miAtributo en o2 vale: " + o2.getMiAtributo());	
		System.out.println("miAtributo en o4 vale: " + o4.getMiAtributo());	
		o4.setMiAtributo(100);	
		System.out.println("miAtributo en o2 vale: " + o2.getMiAtributo());	
		System.out.println("miAtributo en o4 vale: " + o4.getMiAtributo());	
		
		//Lo hacemos bien, clonamos
		MiClase o5 = new MiClase(o1);
		System.out.println("miAtributo en o1 vale: " + o1.getMiAtributo());	
		System.out.println("miAtributo en o5 vale: " + o5.getMiAtributo());
		o1.setMiAtributo(1000);
		System.out.println("miAtributo en o1 vale: " + o1.getMiAtributo());	
		System.out.println("miAtributo en o5 vale: " + o5.getMiAtributo());
		
		//Usamos la segunda vía con método static
		MiClase o6 = MiClase.clonar(o1);
		System.out.println("miAtributo en o6 vale: " + o6.getMiAtributo());
		//La siguiente linea se puede mejorar
		//MiClase o6 = o1.clonar(o1);
		//La mejoramos, usando this
		MiClase o7 = o1.clonar();
		System.out.println("miAtributo en o7 vale: " + o7.getMiAtributo());		
	}

}
