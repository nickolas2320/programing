package co.edu.sena.programing.cap4.negocios;

import co.edu.sena.programming.cap4.Director;
import co.edu.sena.programming.cap4.Empleado;
import co.edu.sena.programming.cap4.Manager;

public class PlanAccionesEmpleados {
	private final int comparteEmpleado = 10;
	private final int comparteManager = 100;
	private final int comparteDirector = 1000;

	
	public int subvencionAcciones(Empleado empleado) {
		if(empleado instanceof Director) {
			return comparteDirector;
		} else {
			if(empleado instanceof Manager) {
				return comparteManager;
			} else {
				return comparteEmpleado;
			}
		}
	}
}
