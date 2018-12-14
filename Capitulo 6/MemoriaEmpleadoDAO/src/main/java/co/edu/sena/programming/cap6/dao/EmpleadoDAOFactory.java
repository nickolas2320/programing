 package co.edu.sena.programming.cap6.dao;

public class EmpleadoDAOFactory {
	public EmpleadoDAO crearEmpleadoDAO() {
		return new MemoriaDAOEmpleadoImp1();
	}
}
