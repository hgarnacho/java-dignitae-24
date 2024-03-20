package p8_primos;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		sc.close();	
		if(esPrimo(numero)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}		
	}
	
	public static boolean esPrimo(int numero) {
		int candidatoDivisor = numero / 2;
		do {
			if(numero % candidatoDivisor == 0) {
				return false;
			}
			candidatoDivisor--;
		}while(candidatoDivisor >1 && numero % candidatoDivisor != 0);
		return true;			
	}

}
