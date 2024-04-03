package ejercicio33_empresaApp;

import java.util.ArrayList;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoInterno ei1 = new EmpleadoInterno(1,"Alberto", "Salazar", 10);
		EmpleadoInterno ei2 = new EmpleadoInterno(3,"Pedro", "Gomez", 10);
		
		EmpleadoExterno ex1 = new EmpleadoExterno(2,"Juan", "Perez", 10);
		EmpleadoExterno ex2 = new EmpleadoExterno(4,"Laura", "edew", 10);
		
		ArrayList <Empleados> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(ei1);
		listaEmpleados.add(ei2);
		listaEmpleados.add(ex1);
		listaEmpleados.add(ex2);
		
		double salarioTotal = 0;
		for(Empleados e : listaEmpleados) {
			salarioTotal += e.obtenerSalario();
			System.out.println(e.getId() + " - " + e.obtenerSalario());
		}
		
		System.out.println(salarioTotal);
		
		
		
	}

}
