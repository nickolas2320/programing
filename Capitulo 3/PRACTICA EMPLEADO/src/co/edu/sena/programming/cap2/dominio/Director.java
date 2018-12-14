package co.edu.sena.programming.cap2.dominio;

public class Director extends Manager{
	private double presupuesto;
	
	public Director(int empleadoId, String nombre, String NNSE, double salario, String nombreDepartamento) {
		super(empleadoId, nombre, NNSE, salario, nombreDepartamento);
			this.presupuesto = presupuesto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}

