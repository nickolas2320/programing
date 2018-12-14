package co.edu.sena.programming.cap6.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.sena.progrmming.cap6.Empleado;

public class MemoriaDAOEmpleadoImp1 {
	private static  Empleado[] empleadoLista = new Empleado[10];
	
	public void añadir(Empleado empleado) {
		empleadoLista[empleado.getId()] = empleado;
	}
	public void actualizar(Empleado empleado) {
		empleadoLista[empleado.getId()] = empleado;
	}
	public void borrar(int id) {
		empleadoLista[id] = null;
	}
	public Empleado encontrarPorId(int id) {
		return empleadoLista[id];
	}
	public Empleado[] getTodosEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		for(Empleado e: empleadoLista) {
			if(e != null) {
				empleados.add(e);
			}
		}
		return empleados.toArray(new Empleado[0]);
	}
	
	private void MemoriaDAOEmpleadoImp1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
