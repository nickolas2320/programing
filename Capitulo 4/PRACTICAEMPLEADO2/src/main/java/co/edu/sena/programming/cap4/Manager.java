package co.edu.sena.programming.cap4;

public class Manager extends Empleado{
	private String nombreDepartamento;

    public Manager(int empleadoId, String nombre, String NSS, double salario, String nombreDepartamento) {
        super(empleadoId, nombreDepartamento, nombreDepartamento, salario);
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    @Override
    public String toString() {
    	return super.toString() + "\numeroDepartamento: " + getNombreDepartamento();
    }
}
