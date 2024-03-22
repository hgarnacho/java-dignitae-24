package e38_arraysMultidimensionales;

public class Inicio {

    public static void main(String[] args) {
    	matrizBidimensional();
    }
    
    public static void matrizBidimensional() {
        // Declaración e inicialización de un array bidimensional
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Acceso a los elementos de la matriz
        System.out.println("Elemento en la fila 0 y columna 0: " + matriz[0][0]);
        System.out.println("Elemento en la fila 1 y columna 2: " + matriz[1][2]);
        
        // Modificación de un elemento de la matriz
        matriz[2][1] = 0;

        // Recorriendo y mostrando los elementos de la matriz
        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
 

}
