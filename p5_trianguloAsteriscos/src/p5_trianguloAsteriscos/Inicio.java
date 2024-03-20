package p5_trianguloAsteriscos;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=numero ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

		int c = 1;
		for(int i=1; i<=numero ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.print("\n");
		}
		
		
	}

}
