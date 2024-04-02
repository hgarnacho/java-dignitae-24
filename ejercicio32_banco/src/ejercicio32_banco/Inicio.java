package ejercicio32_banco;

import java.util.Date;

public class Inicio {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Héctor");
		Cliente c2 = new Cliente(2, "Ana");
		Cliente c3 = new Cliente(3, "María");
		Cliente c4 = new Cliente(4, "Pedro");
		
		c1.addCuentaBancariaAutorizado(new CuentaBancaria("IBAN-1", 1000.0, new Date()));
		c1.addCuentaBancariaAutorizado(new CuentaBancaria("IBAN-2", 500.0, new Date()));
				
		System.out.println(c1);
		
		CuentaBancaria cb1 = new CuentaBancaria("IBAN-3", 100000.0, new Date());
		cb1.setTitular(c4);
		cb1.addAutorizado(c1);
		cb1.addAutorizado(c2);
		cb1.addAutorizado(c3);
		
		System.out.println(cb1);
		
	}

}
