package co.edu.sena.programming.cap6;

public class Gato extends Animal implements Mascota{

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gato(String nombre) {
		super(4);
		this.nombre = nombre;
	}
	
	public Gato() {
		this("Lucas");
	}

	public void jugar() {
		System.out.println(nombre + " le gusta jugar con cuerdas");
		
	}

	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer arañas y peces.");
		
	}
}
