package ejemplo_cuentas_bancarias;

import java.util.Date;

public class CuentaBancaria implements OperacionesBancariasCorrientes{

	private String iban;
	private double saldo;
	private Date fechaApertura;

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
	
	@Override
	public void ingreso(double importe) {
		this.saldo += importe;
		System.out.println("Ingreso realizado. Saldo: " + this.saldo);
	}

	@Override
	public void reintegro(double importe) {
		if(this.saldo - importe < 0) {
			System.out.println("Saldo insuficiente");
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

	public String getIBAN() {
		return this.iban;
	}

	public void setIBAN(String iban) {
		this.iban = iban;
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

	public String toString() {
		return "[IBAN:" + this.iban + ", Saldo: " + this.saldo + ", " + this.getFechaApertura() + "]";
	}
	
}
