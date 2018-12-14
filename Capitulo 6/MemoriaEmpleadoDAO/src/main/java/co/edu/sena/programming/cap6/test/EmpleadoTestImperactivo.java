package co.edu.sena.programming.cap6.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import co.edu.sena.programming.cap6.dao.MemoriaDAOEmpleadoImp1;
import co.edu.sena.progrmming.cap6.Empleado;

public class EmpleadoTestImperactivo {
	public static void main(String[] args) throws Exception{
		boolean TiempoDejardeFumar = false;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		do {
			TiempoDejardeFumar = ejecutarMenu(in);
		} while(!TiempoDejardeFumar);
		
	}
	public static boolean ejecutarMenu(BufferedReader in) throws IOException {
		Empleado empleado;
		String accion;
		int id;
		
		System.out.println("\n\n[C]rear | [L]eer | [A]ctualizar | [B]borrar | [L]ista | [Q]uitar: ");
		accion = in.readLine();
		if((accion.length() == 0) || accion.toUpperCase().charAt(0) == 'Q') {
			return true;
		}
		switch (accion.toUpperCase().charAt(0)) {
		case 'C':
			empleado = inputEmpleado(in);
			dao.add(empleado)
			System.out.println("Registro de empleado agregado exitosamente: " + empleado.getId());
			System.out.println("\n\nCreado: " + empleado);
			break;
		
		case 'R':
			System.out.println("Introduzca el valor int para el ID del empleado: ");
			id = new Integer(in.readLine().trim());
			
			empleado = Empleado.EncontrarPorId(id);
			if(empleado != null) {
				System.out.println(empleado +"\n");
			}else {
				System.out.println("\n\nEmpleado: " + id + "no encontrado");
				break;
			}
			break;
		
		case 'A':
			System.out.println("Introduzca el valor int para el ID del empleado: ");
			id = new Integer(in.readLine().trim());
			
			empleado = null;
			empleado = Empleado.EncontrarPorId(id);
			if(empleado == null) {
				System.out.println("\n\nEmpleado: " + id + " no encontrado");
				break;
			}
			empleado = inputEmpleado(in, empleado, false);
			dao.add(empleado);
			System.out.println("Registro de empleado actualizado exitosamente: " + empleado.getId());
			break;
			
		case 'B':
			System.out.println("Introduzca el valor int para el ID del empleado: ");
			id = new Integer(in.readLine().trim());
			
			empleado = null;
			empleado = Empleado.EncontrarPorId(id);
			
			if(empleado == null) {
				System.out.println("\n\nEmpleado: " + id + " no encontrado");
				break;
			}
			empleado.borrar();
			System.out.println("Empleado borrado: " + id);
			break;
			
		case 'L':
			Empleado[] todosEmpleados = Empleado.getTodosEmpleados();
			for (Empleado empleado1: todosEmpleados) {
				System.out.println(empleado1 + "\n");
			}
			break;
		}
		return false;
		
	}
	public static Empleado inputEmpleado(BufferedReader in) throws IOException{
		return inputEmpleado(in, null, true);
	}
	public static Empleado inputEmpleado(BufferedReader in, Empleado empleadoDefaults, boolean newEmpleado)throws IOException{
		SimpleDateFormat df = new SimpleDateFormat("MMM d, yyyy");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		int id = -1;
		String primerNombre;
		String apellido;
		Date fechaNacimiento = null;
		Empleado empleado;
		float salario;
		
		if(newEmpleado) {
			do {
				System.out.println("Introduzca el valor int para el ID del empleado: ");
				try {
					id = new Integer(in.readLine().trim());
					if(id < 0) {
						System.out.println("Vuelva a intentarlo con un ID de entero positivo válido");
					}
				}catch(NumberFormatException e){
					System.out.println("Vuelva a intentarlo con un ID de entero positivo válido");
				}
			}while(id < 0);
		}else {
			id = empleadoDefaults.getId();
			System.out.println("Modificar los campos de registro de empleado: " + id + ". Presione regresar para aceptar el valor actual.");
		}
		String prompt = "Ingrese el valor para el nombre del empleado" + ((empleadoDefaults == null) ? "" :
			" [" + empleadoDefaults.getPrimerNombre() + "] ");
		
		do {
			System.out.println(prompt + " : ");
			primerNombre= in.readLine().trim();
			if(primerNombre.equals("") && empleadoDefaults != null) {
				primerNombre = empleadoDefaults.getPrimerNombre();
			} 
			if(primerNombre.length() < 1) {
				System.out.println("Vuelva a intentarlo con un nombre válido");
			}
		}while(primerNombre.length() < 1);
		
		prompt = "Ingrese el valor para el apellido del empleado" + ((empleadoDefaults == null) ? "" : 
			"[" + empleadoDefaults.getApellido() + "]");
		
		do {
			System.out.println(prompt + " : ");
			apellido = in.readLine().trim();
			if(apellido.equals("") &&empleadoDefaults != null) {
				apellido = empleadoDefaults.getApellido();
			}
			if(apellido.length() < 1) {
				System.out.println("Por favor, vuelva a intentarlo con un apellido válido");
			}
		}while(apellido.length() < 1);
		
        prompt = "Enter value for employee birth date (" + df.toLocalizedPattern() + ")"
                + ((empleadoDefaults == null) ? "" : " [" + df.format(empleadoDefaults.getFechaNacimiento()) + "]");
		
        do {
        	System.out.println(prompt + " : ");
        	String fechaStr = in.readLine().trim();
        	if(fechaStr.equals("") && empleadoDefaults != null) {
        		fechaNacimiento = empleadoDefaults.getFechaNacimiento();
        	}else {
        		fechaNacimiento = null;
        		try {
        			fechaNacimiento = new Date(df.parse(fechaStr).getTime());
        		}catch(ParseException e) {
        			System.out.println("Vuelva a intentarlo con una fecha de nacimiento válida: " + e.getMessage());
        		}
        	}
        }while (fechaNacimiento == null);
        
        prompt = "Introduzca el valor float para el salario del empleado" + ((empleadoDefaults == null) ? "" : "["
        	+ nf.format((double) empleadoDefaults.getSalario()) + "]");
        do {
        	System.out.println(prompt + " : ");
        	salario = 0;
        	try {
        		String amt = in.readLine().trim();
        		if(!amt.equals("")) {
        			salario = Float.parseFloat(amt);
        		}
        		if(salario == 0 && empleadoDefaults != null) {
        			salario = empleadoDefaults.getSalario();
        		}
        		if(salario < 0) {
        			System.out.println("Por favor, vuelva a intentarlo con un salario positivo");
        			salario = 0;
        		}
        	}catch (NumberFormatException e) {
        		System.out.println("Vuelva a intentarlo con un salario tipo float válido: " + e.getMessage());
        	}
        }while (salario == 0);
        
        empleado = new Empleado(id, primerNombre, apellido, fechaNacimiento, salario);
        return empleado;
        
       
}
public void EmpleadoDAO() {
	EmpleadoDAO dao = new MemoriaDAOEmpleadoImp1(); 
}
public void EmpleadoDAOFactory() {
	EmpleadoDAO dao = factory.crearEmpleadoDAO();
}
}
