package e47_PriorityQueue;

import java.util.PriorityQueue;

public class Inicio {

    public static void main(String[] args) {
        // Crear una PriorityQueue de tipo Integer
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Agregar elementos a la PriorityQueue
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);

        // Mostrar los elementos de la PriorityQueue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
