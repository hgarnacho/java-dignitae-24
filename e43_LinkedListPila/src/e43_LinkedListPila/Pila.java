package e43_LinkedListPila;

import java.util.LinkedList;

public class Pila {
	
    // Crear una LinkedList (también es una Stack - Deque)
    private LinkedList<Tarea> s;
    
    public Pila() {
    	this.s = new LinkedList<>();
    }

    public void push(Tarea t) {
    	this.s.push(t);
    }
    
    public Tarea pop() {
    	return this.s.pop();
    }

    public Tarea getTop() {    	
    	return this.s.peek();
    }
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Tarea t : this.s) {
            sb.append(" (");
            sb.append(t.toString());
            sb.append(") ");            
        }
        sb.append("]");
        return sb.toString();
    }
    
}

