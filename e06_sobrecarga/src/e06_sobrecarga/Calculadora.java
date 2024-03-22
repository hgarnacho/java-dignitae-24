package e06_sobrecarga;

public class Calculadora {

	public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public float sumar(float a, float b) {
        return a + b;
    }

    public String sumar(String a, String b) {
        return a + b;
    }

}


