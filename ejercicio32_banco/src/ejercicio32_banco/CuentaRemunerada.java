package ejercicio32_banco;

import java.util.ArrayList;
import java.util.Date;

public class CuentaRemunerada extends CuentaBancaria implements OperacionesBancariasRemuneradas{

	private double interes;
	private double saldoMedio;
	
	private Cliente titular;
	private ArrayList<Cliente> autorizados = new ArrayList<>();
		
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

	public CuentaRemunerada(String iban, double saldo, Date fechaApertura, double interes, double saldoMedio) {
		super(iban, saldo, fechaApertura);
		this.interes = interes;
		this.saldoMedio = saldoMedio;
	}	
	
	@Override
	public void aplicacionIntereses() {
		this.setSaldo(this.getSaldo() + (this.saldoMedio * (this.interes)) );		
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getSaldoMedio() {
		return saldoMedio;
	}

	public void setSaldoMedio(double saldoMedio) {
		this.saldoMedio = saldoMedio;
	}
	
	public String toString() {
		return  super.toString() + "[Saldo medio:" + this.saldoMedio + ", Interés: " + this.interes + "]";
	}

	public void addAutorizado(Cliente c) {
		this.autorizados.add(c);
	}
	
}
