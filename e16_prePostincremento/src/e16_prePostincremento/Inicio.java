package e16_prePostincremento;

public class Inicio {

	public static void main(String[] args) {
		int a;
		int b;
		a=10;
		b=++a;
		System.out.println("En preincremento a vale " + a + " y b vale: " + b);
		a=10;
		b=a++;
		System.out.println("En preincremento a vale " + a + " y b vale: " + b);		
	}

}
