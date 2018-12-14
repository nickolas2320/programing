package co.edu.sena.programming.cap6.dao;

import co.edu.sena.progrmming.cap6.Empleado;

public interface EmpleadoDAO {
	public void añadir(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void borrar(int id);
	public Empleado encontrarPorId(int id);
	public Empleado [] getTodosEmpleado();
}
