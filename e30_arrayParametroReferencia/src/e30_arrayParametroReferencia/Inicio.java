package e30_arrayParametroReferencia;

public class Inicio {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        modificarArray(array);
        System.out.println("Elementos del array después de modificarArray:");
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void modificarArray(int[] arr) {
        arr[0] = 100;
    }

}
