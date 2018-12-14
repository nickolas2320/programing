package co.edu.sena.programming.cap6;

public class Gato extends Animal implements Mascota{

	private String nombre;
	
	public Gato() {
        this("Gaston");
    }

	
	public Gato(String nombre) {
		super(4);
		this.nombre = nombre;
	}

	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer arañas y peces.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = nombre;
	}

	public void jugar() {
		System.out.println(nombre + "Le gusta jugar con una cuerda");
		
	}

}
