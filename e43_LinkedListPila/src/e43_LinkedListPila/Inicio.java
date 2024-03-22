package e43_LinkedListPila;

public class Inicio {

	public static void main(String[] args) {
		Pila s = new Pila();
		s.push(new Tarea(1, "tarea 1"));
		s.push(new Tarea(2, "tarea 2"));
		s.push(new Tarea(3, "tarea 3"));
		s.push(new Tarea(4, "tarea 4"));
		
		//Mostramos pila inicial
		System.out.println(s.toString());
		
		//Extraemos la cima
		System.out.println("Extraemos la cima -> (" + s.pop().toString() + ")");
		System.out.println(s.toString());
		
		//Insertamos al inicio de la pila
		System.out.println("Insertamos al inicio de la pila -> ( 5 - tarea 5 )");
		s.push(new Tarea(5, "tarea 5"));
		System.out.println(s.toString());

	}

}

