package ejercicio21_burbuja;

import java.util.Arrays;

public class Inicio {

	public static void main(String[] args) {
		
		int[] vector = {3, 4 , 9, 8, 2, 6, 7, 5, 1, 10};  
		
		for(int i = 1; i<10 ;i++){
			for(int j=9 ; j>=i; j--){
				if(vector[j] < vector[j-1]){
					int aux = vector[j]; 
					vector[j] = vector[j-1];
					vector[j-1] = aux;
				}
				System.out.println(Arrays.toString(vector));
			}	
		}
		
		
	}

}
