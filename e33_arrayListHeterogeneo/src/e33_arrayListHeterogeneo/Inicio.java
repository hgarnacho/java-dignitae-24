package e33_arrayListHeterogeneo;

public class Inicio {

	public static void main(String[] args) {
		HogarConAnimales h = new HogarConAnimales();
		h.addAnimal(HogarConAnimales.PERRO, "Toby");
		h.addAnimal(HogarConAnimales.PERRO, "Max");
		h.addAnimal(HogarConAnimales.PERRO, "Rocky");
		
		h.addAnimal(HogarConAnimales.GATO, "Mia");
		h.addAnimal(HogarConAnimales.GATO, "Luna");
		h.addAnimal(HogarConAnimales.GATO, "Kara");

		h.saludadme();
		
	}

}
