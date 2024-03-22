package e42_LinkedListCola;

public class Inicio {

	public static void main(String[] args) {
		Cola c = new Cola();
		c.offer(new Tarea(1, "tarea 1"));
		c.offer(new Tarea(2, "tarea 2"));
		c.offer(new Tarea(3, "tarea 3"));
		c.offer(new Tarea(4, "tarea 4"));
		
		//Mostramos cola inicial
		System.out.println(c.toString());
		
		//Extraemos la cima
		System.out.println("Extraemos la cima -> (" + c.poll().toString() + ")");
		System.out.println(c.toString());
		
		//Insertamos al final de lacola
		System.out.println("Insertamos al final de la cola -> ( 5 - tarea 5 )");
		c.offer(new Tarea(5, "tarea 5"));
		System.out.println(c.toString());
		
	}

}
