package ejercicio32_banco;

import java.util.ArrayList;

public class Cliente {

	private Integer id;
	private String nombre;	
	
	private ArrayList<CuentaBancaria> cuentasBancariasTitular = new ArrayList<>();
	private ArrayList<CuentaRemunerada> cuentasRemuneradasTitular = new ArrayList<>();	
	private ArrayList<CuentaBancaria> cuentasBancariasAutorizado = new ArrayList<>();
	private ArrayList<CuentaRemunerada> cuentasRemuneradasAutorizado = new ArrayList<>();
		
	public Cliente(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Cliente(Integer id, 
			String nombre, 
			ArrayList<CuentaBancaria> cuentasBancariasTitular,
			ArrayList<CuentaRemunerada> cuentasRemuneradasTitular, 
			ArrayList<CuentaBancaria> cuentasBancariasAutorizado,
			ArrayList<CuentaRemunerada> cuentasRemuneradasAutorizado) 
	{
		this.id = id;
		this.nombre = nombre;
		this.cuentasBancariasTitular = cuentasBancariasTitular;
		this.cuentasRemuneradasTitular = cuentasRemuneradasTitular;
		this.cuentasBancariasAutorizado = cuentasBancariasAutorizado;
		this.cuentasRemuneradasAutorizado = cuentasRemuneradasAutorizado;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<CuentaBancaria> getCuentasBancariasTitular() {
		return cuentasBancariasTitular;
	}
	
	public void setCuentasBancariasTitular(ArrayList<CuentaBancaria> cuentasBancariasTitular) {
		this.cuentasBancariasTitular = cuentasBancariasTitular;
	}
	
	public ArrayList<CuentaRemunerada> getCuentasRemuneradasTitular() {
		return cuentasRemuneradasTitular;
	}
	
	public void setCuentasRemuneradasTitular(ArrayList<CuentaRemunerada> cuentasRemuneradasTitular) {
		this.cuentasRemuneradasTitular = cuentasRemuneradasTitular;
	}
	
	public ArrayList<CuentaBancaria> getCuentasBancariasAutorizado() {
		return cuentasBancariasAutorizado;
	}
	
	public void setCuentasBancariasAutorizado(ArrayList<CuentaBancaria> cuentasBancariasAutorizado) {
		this.cuentasBancariasAutorizado = cuentasBancariasAutorizado;
	}
	
	public ArrayList<CuentaRemunerada> getCuentasRemuneradasAutorizado() {
		return cuentasRemuneradasAutorizado;
	}
	
	public void setCuentasRemuneradasAutorizado(ArrayList<CuentaRemunerada> cuentasRemuneradasAutorizado) {
		this.cuentasRemuneradasAutorizado = cuentasRemuneradasAutorizado;
	}
	
	public void addCuentaRemuneradaTitular(CuentaRemunerada c) {
		this.cuentasRemuneradasTitular.add(c);
	}

	public void addCuentaRemuneradaAutorizado(CuentaRemunerada c) {
		this.cuentasRemuneradasAutorizado.add(c);
	}

	public void addCuentaBancariaTitular(CuentaBancaria c) {
		this.cuentasBancariasTitular.add(c);
	}

	public void addCuentaBancariaAutorizado(CuentaBancaria c) {
		this.cuentasBancariasAutorizado.add(c);
	}
	
	public String toString() {
		double saldoTotal = 0;
		String cadena = "[ Id: " + this.id + ", Nombre: " + this.nombre + "]";
		
		cadena  += "\n Cuentas bancarias titular:\n[";
		for (CuentaBancaria cuenta: cuentasBancariasTitular) {
			cadena += cuenta.getIban() + " ";
			saldoTotal += cuenta.getSaldo();
		}
		cadena += "]\n";

		cadena  += "\n Cuentas bancarias autorizado:\n[";
		for (CuentaBancaria cuenta: cuentasBancariasAutorizado) {
			cadena += cuenta.getIban() + " ";
			saldoTotal += cuenta.getSaldo();
		}
		cadena += "]\n";
		
		cadena  += "\n Cuentas remuneradas titular:\n[";
		for (CuentaRemunerada cuenta: cuentasRemuneradasTitular) {
			cadena += cuenta.getIban() + " ";
			saldoTotal += cuenta.getSaldo();
		}
		cadena += "]\n";

		cadena  += "\n Cuentas remuneradas autorizado:\n[";
		for (CuentaRemunerada cuenta: cuentasRemuneradasAutorizado) {
			cadena += cuenta.getIban() + " ";
			saldoTotal += cuenta.getSaldo();
		}
		cadena += "]\n";
		
		cadena += "Saldo total: " + saldoTotal +"\n";
		
		return cadena;
	}
	
}
