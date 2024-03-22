package e42_LinkedListCola;

import java.util.LinkedList;

public class Cola {
	
    // Crear una LinkedList (también es una Queue)
    private LinkedList<Tarea> q;
    
    public Cola() {
    	this.q = new LinkedList<>();
    }

    public void offer(Tarea t) {
    	this.q.offer(t);
    }
    
    public Tarea poll() {
    	return this.q.poll();
    }

    public Tarea getTop() {    	
    	return this.q.peek();
    }
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Tarea t : this.q) {
            sb.append(" (");
            sb.append(t.toString());
            sb.append(") ");            
        }
        sb.append("]");
        return sb.toString();
    }
    
}
