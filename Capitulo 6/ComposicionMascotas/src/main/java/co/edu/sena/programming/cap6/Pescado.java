package co.edu.sena.programming.cap6;

public class Pescado extends Animal implements Mascota{
	private String nombre;
	
	public Pescado() {
		super(0);
	}

	@Override
	public void comer() {
		System.out.println("Peces comen escoria de estanque");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = nombre;
		
	}

	public void jugar() {
		System.out.println("Solo sigue nadando");
	}
	
	public void caminar() {
		super.caminar();
		System.out.println("El pescado, por supuesto, no puede caminar; ellos nadan.");
	}
	
	
}
