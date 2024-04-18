package ejemplo_cadena_test.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ejemplo_cadena_test.Cadena;


public class CadenaTest {
	
    @ParameterizedTest
    @MethodSource("generadorDatosTestConvertirMayusculas")
	void testPasarMayusculas(String texto, String textoEsperado) {
    	Cadena cadenaTest = new Cadena(texto);    	
        assertEquals(cadenaTest.convertirMayuscula(), textoEsperado );
	}
	
    static Stream<Arguments> generadorDatosTestConvertirMayusculas() {
        return Stream.of(
            Arguments.of("hola", "HOLA" ),
            Arguments.of("buenos días", "BUENOS DÍAS")
        );
    }	
	
	
	
}
