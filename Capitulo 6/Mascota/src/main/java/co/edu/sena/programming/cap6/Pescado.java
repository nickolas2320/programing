package co.edu.sena.programming.cap6;

public class Pescado extends Animal implements Mascota{
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pescado() {
		super(0);	
	}

	public void jugar() {
		System.out.println("solo sigue nadando");
	}

	@Override
	public void comer() {
		System.out.println("los peces comen escoria de estanque");		
	}
	
	@Override
	public void caminar() {
		super.caminar();
		System.out.println("El pescado, por supuesto, no puede caminar; ellos nadan");
	}
	
	
}
