package co.edu.sena.programming.cap2.dominio;

public class Manager extends Empleado{
	private String nombreDepartamento;

	public Manager(int empleadoId, String nombre, String NNSE, double salario, String nombreDepartamento) {
		super(empleadoId, NNSE, nombre, salario);
			this.nombreDepartamento = nombreDepartamento;
	}
	public  String getNombreDepartamento() {
		return getNombreDepartamento();
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	

}
