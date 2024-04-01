package ejemplo_cuentas_bancarias;

import java.util.Date;

public class CuentaRemunerada extends CuentaBancaria implements OperacionesBancariasRemuneradas{

	private double interes;
	private double saldoMedio;
	
	public CuentaRemunerada(String iban, double saldo, Date fechaApertura, double interes, double saldoMedio) {
		super(iban, saldo, fechaApertura);
		this.interes = interes;
		this.saldoMedio = saldoMedio;
	}	
	
	@Override
	public void aplicacionIntereses(double importe) {
		this.saldoMedio = this.saldoMedio * (1 + this.interes);
		
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

}
