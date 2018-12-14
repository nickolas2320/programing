package co.edu.sena.programming.cap4;

import java.text.NumberFormat;

public class Empleado {
	private int empleadoId;
	private String nombre;
	private String NSS;
	private double salario;
	public Empleado(int empleadoId, String nombre, String nSS, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.NSS = nSS;
		this.salario = salario;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	public String getNSS() {
		return NSS;
	}
	
	public double getSalario() {
		return salario;
	}
	public void aumentoSueldo(double incremento) {
		if(incremento > 0) {
			salario += incremento;
		}
		
	}
	@Override
	public String toString() {
		return "Id empleado: " + getEmpleadoId() + "\n" + "Nombre empleado: " + getNombre() + 
				"\n" + "NSS empleado: " + getNSS() + "\n" + "Salario empleado: " +
				NumberFormat.getCurrencyInstance().format(getSalario());  
	}
}

	
