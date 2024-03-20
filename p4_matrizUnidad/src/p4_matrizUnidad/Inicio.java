package p4_matrizUnidad;

public class Inicio {
	public static void main(String[] args) {		
		for(int i=0; i<10 ; i++) {
			for(int j=0; j<10 ; j++) {
				if(i==j) {					
					System.out.print("1 ");
				} else {
					System.out.print("0 ");					
				}
			}	
			System.out.println("\n");
		}
	}
}

