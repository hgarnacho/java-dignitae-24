package ejercicio32_banco;

import java.util.ArrayList;
import java.util.Date;

public class CuentaBancaria implements OperacionesBancariasCorrientes{

	private String iban;
	private double saldo;
	private Date fechaApertura;

	private Cliente titular;
	private ArrayList<Cliente> autorizados = new ArrayList<>();

	public CuentaBancaria() {
		this.iban = "";
		this.saldo = 0.0;
		this.fechaApertura = new Date();		
	}
	
	public CuentaBancaria(String iban, double saldo, Date fechaApertura) {
		this.iban = iban;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
	}	
	
	public CuentaBancaria(CuentaBancaria c) {
		this.iban = c.iban;
		this.saldo = c.saldo;
		this.fechaApertura = c.fechaApertura;		
	}
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public ArrayList<Cliente> getAutorizados() {
		return autorizados;
	}

	public void setAutorizados(ArrayList<Cliente> autorizados) {
		this.autorizados = autorizados;
	}

	@Override
	public void ingreso(double importe) {
		this.saldo += importe;
		System.out.println("Ingreso realizado. Saldo: " + this.saldo);
	}

	@Override
	public void reintegro(double importe) {
		if(this.saldo - importe < 0) {
			System.out.println("Saldo insuficiente. Saldo: " + this.saldo);
		} else {
			this.saldo -= importe;
			System.out.println("Reintegro realizado. Saldo: " + this.saldo);
		}
	}

	@Override
	public void transferencia(CuentaBancaria c, double importe) {
		if(this.saldo - importe < 0) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo-= importe;
			c.saldo += importe;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	
	public void addAutorizado(Cliente c) {
		this.autorizados.add(c);
	}
	
	public String toString() {		
		String cadena = "[ IBAN: " + this.iban + ", Saldo: " + this.saldo + ", Fecha apertura: " + this.fechaApertura  + "]";
		
		cadena  += "\n Titular: [Id: " + this.titular.getId() + ", " + this.titular.getNombre() + "]";
		cadena += "]\n";

		cadena  += "\n Autorizados:\n[";
		for (Cliente cliente: autorizados) {
			cadena  += "\n[Id: " + cliente.getId() + ", " + cliente.getNombre() + "]";
		}
		cadena += "]\n";
				
		return cadena;
	}
	
}
