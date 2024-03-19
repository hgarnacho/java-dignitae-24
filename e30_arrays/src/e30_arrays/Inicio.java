package e30_arrays;

public class Inicio {

	public static void main(String[] args) {
		int[] miArray = {1,2,3};
		
		for(int i=0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
				
		metodoEjemplo(miArray);
		
		for(int i=0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
		

	}
	
	public static void metodoEjemplo(int[] unArray) {		
		unArray[0] = 1000;
	}

}


