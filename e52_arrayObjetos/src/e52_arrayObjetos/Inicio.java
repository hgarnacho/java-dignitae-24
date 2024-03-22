package e52_arrayObjetos;

public class Inicio {

	public static void main(String[] args) {
		// Crear un array de objetos Persona
        Persona[] personas = new Persona[3];

        // Inicializar los objetos del array
        personas[0] = new Persona("María", "Sánchez");
        personas[1] = new Persona("Federico", "Ruiz");
        personas[2] = new Persona("Ana", "Salazar");

        // Iterar sobre el array y imprimir los detalles de cada persona
        for (Persona p: personas) {
            System.out.println(p.toString());
        }
	}

}
