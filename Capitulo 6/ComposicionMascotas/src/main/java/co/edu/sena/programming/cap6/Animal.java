package co.edu.sena.programming.cap6;

public abstract class Animal {
	protected int piernas;

	public Animal(int piernas) {
		this.piernas = piernas;
	}
	public void caminar() {
		System.out.println("Este animal camina en " + piernas + " patas.");
	}
	public abstract void comer();
	
}
