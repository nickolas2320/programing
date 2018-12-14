package co.edu.sena.ejercicio;
import co.edu.sena.ejercicio.dominio.Empleado;
public class EmpleadoTest {

	public static void main(String[] args) {
		Empleado emp = new Empleado(0, null, null, 0);
		emp.setEmpleadoId(001);
		emp.setNombre("Cristian");
		emp.setNSS("123");
		emp.setSalario(780850);
		System.out.println("ID del empleado: " + emp.getEmpleadoId());
		System.out.println("Nombre: " + emp.getNombre());
		System.out.println("Numero De Seguridad Social: " + emp.getNSS());
		System.out.println("Salario: " + emp.getSalario());
	}

}
