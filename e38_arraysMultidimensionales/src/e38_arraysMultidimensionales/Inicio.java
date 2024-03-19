package e38_arraysMultidimensionales;

public class Inicio {

	public static void main(String[] args) {
		//1 2 3
		//4 5 6
		//7 8 9 
		int[][] matriz = { {1,2,3} , {4,5,6} , {7,8,9} };
		
		matriz[2][2] = 99;
		
		System.out.println("Elemento en fila 2 columna 2 vale " + matriz[2][2]);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.print("\n");
		}

	}

}
