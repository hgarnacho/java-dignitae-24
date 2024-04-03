package ejercicio33_empresaApp;

public class EmpleadoExterno extends Empleados implements ControlEmpleados{
	
	private int numObjetivos;
	private final int porcentajeExternos = 10;
	
	public EmpleadoExterno(int id, String nombre, String apellidos, int numObjetivos) {
		super(id, nombre, apellidos);
		this.setNumObjetivos(numObjetivos);
	}

	public int getNumObjetivos() {
		return numObjetivos;
	}

	public void setNumObjetivos(int numObjetivos) {
		this.numObjetivos = numObjetivos;
	}

	@Override
	public double obtenerSalario() {
		return this.getSueldo() + (this.getSueldo() * (((double) this.porcentajeExternos/100)*this.numObjetivos));
	}
	
}
