package co.edu.sena.programming.cap2;
import co.edu.sena.programming.cap2.dominio.Administrador;
import co.edu.sena.programming.cap2.dominio.Director;
import co.edu.sena.programming.cap2.dominio.Empleado;
import co.edu.sena.programming.cap2.dominio.Ingeniero;
import co.edu.sena.programming.cap2.dominio.Manager;
public class EmpleadoTest {
	public static void main(String args) {
		Ingeniero ing = new Ingeniero(0, args, args, 0);
		ing.setEmpleadoId(101);
		ing.setNombre("Cristian Tirano");
		ing.setNNSE("123_456_7890");
		ing.setSalario(3_500_000.00);

		Manager man = new Manager(0, args, args, 0, args);
		man.setEmpleadoId(201);
		man.setNombre("Nicolas Rodriguez");
		man.setNNSE("132-465-7980");
		man.setSalario(2_000_000.00);
		man.setNombreDepartamento("Colombian Marketing, Bogota");
		
		Administrador adm = new Administrador(0, args, args, 0);
		adm.setEmpleadoId(301);
		adm.setNombre("Jennifer Cruz");
		adm.setNNSE("987_654_3210");
		adm.setSalario(3_000_000.00);
		
		Director dir = new Director(0, args, args, 0, args);
		dir.setEmpleadoId(401);
		dir.setNombre("Juan Gomez");
		dir.setNNSE("978-645-3120");
		dir.setSalario(4_000_000.00);
		dir.setNombreDepartamento("Colombian Marketing, Bogota");
		dir.setPresupuesto(4_000_000.00);
	}
	    public static void printEmpleado(Empleado emp) {
	    	System.out.println();
	    	System.out.println("ID Empleado: " + emp.getEmpleadoId());
	    	System.out.println("Nombre Empleado: " + emp.getNombre());
	    	System.out.println("Numero Seguridad Socisal: " + emp.getNNSE());
	    	System.out.println("Salario Empleado: " + emp.getSalario());
	    	
			
	    }
	    
	    

}
