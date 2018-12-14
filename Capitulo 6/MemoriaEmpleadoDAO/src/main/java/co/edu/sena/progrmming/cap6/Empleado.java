package co.edu.sena.progrmming.cap6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
	private int id;
	private String primerNombre;
	private String apellido;
	private Date fechaNacimiento;
	private float salario;
	
	private static Empleado[] empleadoLista = new Empleado[10];
	
	public Empleado() {
		
	}
	
	public Empleado(int id, String primerNombre, String apellido, Date fechaNacimiento, float salario) {
		this.id = id;
		this.primerNombre = primerNombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public float getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "ID Empleado: " + getId() + "\n" 
				+ "Nombre Empleado: " + getPrimerNombre() + " " + getApellido() + "\n"
				+ "Fecha Nacimiento: " + new SimpleDateFormat("MMMM d, yyyy").format(getFechaNacimiento()) + "\n"
				+ "Salario: " + NumberFormat.getCurrencyInstance().format((double)getSalario());
		}
	public void guardar() {
		empleadoLista[id] = this;
	}
	
	public void borrar() {
		empleadoLista[id] = null;
	}
	
	public static Empleado EncontrarPorId(int id) {
		return empleadoLista[id];
	}
	
	public static Empleado[] getTodosEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		for(Empleado e: empleadoLista) {
			if(e != null) {
				empleados.add(e);
		}
	}
		return empleados.toArray(new Empleado[0]);
}
}
