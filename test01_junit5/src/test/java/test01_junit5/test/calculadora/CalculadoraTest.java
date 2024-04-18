package test01_junit5.test.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import test01_junit5.Calculadora;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class CalculadoraTest {
	
	static Calculadora c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tests finalizados");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
    @ParameterizedTest
    @MethodSource("generadorDatosTestSumar")
    void testSumar(int sumando1, int sumando2, int valorEsperado) {
        assertEquals(valorEsperado, c.sumar(sumando1, sumando2) );
    }
	
    @ParameterizedTest
    @MethodSource("generadorDatosTestRestar")
	void testRestar(int sustraendo, int minuendo, int valorEsperado) {
        assertEquals(valorEsperado, c.restar(sustraendo, minuendo) );
	}
	
    static Stream<Arguments> generadorDatosTestSumar() {
        return Stream.of(
            Arguments.of(1, 1, 2),
            Arguments.of(2, 3, 5),
            Arguments.of(5, -3, 2),
            Arguments.of(0, 0, 0)  
        );
    }

    static Stream<Arguments> generadorDatosTestRestar() {
        return Stream.of(
            Arguments.of(1, 1, 0),
            Arguments.of(2, 3, -1),
            Arguments.of(5, -3, 8),
            Arguments.of(0, 0, 0)            
        );
    }
	
}
