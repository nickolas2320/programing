package co.edu.sena.programming.cap2.dominio;

public class Empleado {
	private int empleadoId;
	private String nombre;
	private String NNSE;
	private double salario;

	public Empleado(int empleadoId, String nombre, String NNSE, double salario) {
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.NNSE = NNSE;
		this.salario = salario;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	
	public String getNNSE() {
		return NNSE;
	}

	

	public double getSalario() {
		return salario;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void AumentoSalario(double incremento) {
		salario += incremento;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
		
	}

	public void setNNSE(String NNSE) {
		this.NNSE = NNSE;
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
}
