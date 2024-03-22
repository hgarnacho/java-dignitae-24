package e06_sobrecarga;

public class Inicio {

    public static void main(String[] args) {
        Calculadora c= new Calculadora();

        System.out.println("Suma de enteros: " + c.sumar(5, 3));
        System.out.println("Suma de enteros: " + c.sumar(5, 3, 2)); 
        //En java, si se indica un número literal, se considera double.
        //Para que se considere float, se debe indicar la f
        System.out.println("Suma de flotantes: " + c.sumar(2.5f, 3.7f)); 
        System.out.println("Concatenación de cadenas: " + c.sumar("Hola", "Mundo")); 
    }

}
