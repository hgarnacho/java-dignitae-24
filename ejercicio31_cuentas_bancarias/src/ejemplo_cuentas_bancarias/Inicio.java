package ejemplo_cuentas_bancarias;

import java.util.Date;

public class Inicio {

	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria("IBAN-1", 10000.00, new Date());
		System.out.println(c1);
		c1.ingreso(500);
		c1.reintegro(1000);
		c1.reintegro(10000);
	
		CuentaBancaria c2 = new CuentaBancaria(c1);
		System.out.println(c2);
		
		c1.transferencia(c2, 1000);
		System.out.println(c1);
		System.out.println(c2);
		
		CuentaRemunerada c3 = new CuentaRemunerada("IBAN-3", 1000.00, new Date(), 0.05, 10000);
		System.out.println(c3);	
		c3.aplicacionIntereses();
		System.out.println(c3);			
	}

}
