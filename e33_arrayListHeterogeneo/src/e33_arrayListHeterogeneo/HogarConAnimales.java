package e33_arrayListHeterogeneo;

import java.util.ArrayList;

public class HogarConAnimales {

	public static final int GATO = 1;
	public static final int PERRO = 2;
	
	
	// Crear un ArrayList de Animales
    private ArrayList<Animal> listaAnimales;
	
	public HogarConAnimales() {
		listaAnimales = new ArrayList<>();
	}

    public int addAnimal(int tipoAnimal, String nombre) {
    	if(tipoAnimal != HogarConAnimales.GATO && tipoAnimal != HogarConAnimales.PERRO) {
    		return 0;
    	} 
    	
    	if(tipoAnimal == HogarConAnimales.GATO) {
    		this.listaAnimales.add(new Gato(nombre));
    	} else {
    		this.listaAnimales.add(new Perro(nombre));    		
    	}
    	
    	return 1;
    }
    
    public int removeAnimal(int tipoAnimal, String nombre) {
    	if(tipoAnimal != HogarConAnimales.GATO && tipoAnimal != HogarConAnimales.PERRO) {
    		return 0;
    	} 
    	
    	if(tipoAnimal == HogarConAnimales.GATO) {
    		this.listaAnimales.remove(new Gato(nombre));
    	} else {
    		this.listaAnimales.remove(new Perro(nombre));    		
    	}
    	
    	return 1;
    }
    
    public void saludadme() {
    	//Para saber la clase podemos usar:
    	//getClass()
    	//instanceOf
    	for (Animal a : this.listaAnimales) {
    		String tipoObjeto = a instanceof Perro ? "Perro" : "Gato";    		
    		System.out.println("Hola, soy un " + tipoObjeto + ", mi clase es " + a.getClass() + " y te saludo: " + a.saludar());
    	}
    }
    
}
 