package e05_constructores;

public class Saludo {
    private String mensaje;
    
    // Constructor que acepta un mensaje como parámetro
    public Saludo(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void dimeSaludo() {
    	System.out.println(this.mensaje);
    }
}
