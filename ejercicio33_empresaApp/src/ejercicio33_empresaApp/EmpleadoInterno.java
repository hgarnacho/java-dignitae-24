package ejercicio33_empresaApp;

public class EmpleadoInterno extends Empleados implements ControlEmpleados {
	
	private int antiguedad;
	private final int porcentajeInternos = 3;
	
	public EmpleadoInterno(int id, String nombre, String apellidos, int antiguedad) {
		super(id, nombre, apellidos);
		this.setAntiguedad(antiguedad);
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double obtenerSalario() {
		// TODO Auto-generated method stub
		return this.getSueldo() + (this.getSueldo() * (((double) this.getPorcentajeInternos() / 100)*this.antiguedad));
	}
	
	public int getPorcentajeInternos() {
		return porcentajeInternos;
	}


}
