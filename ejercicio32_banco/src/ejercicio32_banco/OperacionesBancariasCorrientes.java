package ejercicio32_banco;

public interface OperacionesBancariasCorrientes {
	
	public void ingreso(double importe);
	public void reintegro(double importe);
	public void transferencia(CuentaBancaria c, double importe);
	
}
