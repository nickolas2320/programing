package co.edu.sena.ejercicio.dominio;

public class Empleado {
	public int empleadoId;
	public String nombre;
	public String NSS;
	public double salario;

	public Empleado(int emplaedoId, String nombre, String NSS, double salario) {
		
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNSS() {
		return NSS;
	}

	public void setNSS(String nSS) {
		NSS = nSS;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double d) {
		this.salario = d;
	}
	
	
}
