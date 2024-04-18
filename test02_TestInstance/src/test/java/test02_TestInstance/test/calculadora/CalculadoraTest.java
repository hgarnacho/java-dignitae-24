package test02_TestInstance.test.calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraTest {

	  private int contador = 0;

	    @Test
	    void test1() {
	        contador++;
	        System.out.println("Contador en test1: " + contador);
	    }

	    @Test
	    void test2() {
	        contador++;
	        System.out.println("Contador en test2: " + contador);
	    }
}
