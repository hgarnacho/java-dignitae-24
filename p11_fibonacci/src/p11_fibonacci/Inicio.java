package p11_fibonacci;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();		
		sc.close();
		fibonacci(numero);
	}
	
	public static void fibonacci(int numeros) {
	
		int numero1 = 0;
		int numero2 = 1;
		int numeroFibonacci = 0;
		
		for(int i=1; i<=numeros; i++) {
			numeroFibonacci = numero1 + numero2;
			System.out.print(numeroFibonacci + " ");
			numero1 = numero2;
			numero2 = numeroFibonacci;
		}
	
	}

}
