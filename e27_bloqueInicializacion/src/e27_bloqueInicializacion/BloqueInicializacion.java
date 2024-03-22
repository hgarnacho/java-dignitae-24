package e27_bloqueInicializacion;

public class BloqueInicializacion {
	
	private int atributoMiembro;
	public static int atributoStatic;
	final int CONSTANTE_MIEMBRO;
	static final int CONSTANTE_STATIC; 
	
    // Bloque de inicialización estático
    static {
        System.out.println("Este es el bloque de inicialización estático.");
        System.out.println("Inicializamos variables y constantes static");
       
        CONSTANTE_STATIC = 10;
        atributoStatic = 15;
    }

    // Bloque de inicialización de instancia
    {
        System.out.println("Este es el bloque de inicialización de instancia.");
        System.out.println("Inicializamos constantes de instancia (miembros)");
        this.CONSTANTE_MIEMBRO = 30;
            
    }

    // Constructor
    public BloqueInicializacion() {
        System.out.println("Ahora se está ejecutando el constructor.");
        System.out.println("Inicializamos variables de instancia (miembros)");
        this.atributoMiembro = 40;  
    }
    
    public String toString() {
    	String s =  "miembros: CONSTANTE_MIEMBRO: " + this.CONSTANTE_MIEMBRO + " - atrinutoMiembro: " + this.atributoMiembro;
    	s += "EstáticosS: CONSTANTE_STATIC: " + CONSTANTE_STATIC + " - atrinbutoStatic: " + atributoStatic;
    	return s;
    	
    }
    
    
}
