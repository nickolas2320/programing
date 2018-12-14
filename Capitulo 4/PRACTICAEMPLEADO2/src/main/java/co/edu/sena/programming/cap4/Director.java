package co.edu.sena.programming.cap4;

public class Director extends Manager{
	private double presupuesto;

    public Director(int empleadoId, String nombre, String NSS, double salario, String departamento, double presupuesto) {
        super(empleadoId, nombre, NSS, salario, departamento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    @Override
    public String toString() {
    	return super.toString() + "\nPresupusto: " + getPresupuesto();
    }
}
