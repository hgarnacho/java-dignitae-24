package e51_operadoresBitwise;

public class Inicio {

	public static void main(String[] args) {
		int a = 5;    // Representación binaria: 00000101
		int b = 2;    // Representación binaria: 00000010

		int resultado = a & b;  // Operación bitwise AND
		System.out.println(resultado);  // Imprime: 0 (00000000)

		resultado = a | b;  // Operación bitwise OR
		System.out.println(resultado);  // Imprime: 7 (00000111)
		
		resultado = a ^ b;  // Operación bitwise XOR
		System.out.println(resultado);  // Imprime: 7 (00000111)
		
		resultado = ~a;  // Operación bitwise NOT
		// Los negativos se representan en complemento a2
		// 11111010
		// El bit más a la izquierda representa el signo, si es 1 es negativo
		// Se toma el valor absoluto de los 7 bits invertidos de la derecha -> 0000101 (5)
		// Se suma 1 (5+1) = 6 -> el valor representado es el -6
		System.out.println(resultado);  // Imprime: -6  
		
		resultado = a << 1;  // Desplazamiento a la izquierda (Se multiplica por 2)
		System.out.println(resultado);  
		
		resultado = a >> 1;    // Desplazamiento a la derecha (signo preservado) (Se divide entre 2)
		System.out.println(resultado);  

		resultado = a >>> 1;  // Desplazamiento a la derecha sin signo
		System.out.println(resultado);  
		
	}

}
