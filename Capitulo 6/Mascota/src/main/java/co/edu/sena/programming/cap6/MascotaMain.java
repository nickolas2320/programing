package co.edu.sena.programming.cap6;

public class MascotaMain {
	public static void main(String [] args) {
			Animal animal;
			Araña araña = new Araña();
			araña.comer();
			araña.caminar();
			animal = new Araña();
			animal.comer();
			animal.caminar();
			
			Mascota mascota;
			Gato gato = new Gato("Magolito");
			gato.caminar();
			gato.comer();
			gato.jugar();
			animal = new Gato();
			animal.caminar();
			animal.comer();
			mascota = new Gato();
			mascota.setNombre("Dr. Gaston");
			mascota.jugar();
			
			Pescado pescado = new Pescado();
			pescado.setNombre("Nemo");
			pescado.caminar();
			pescado.comer();
			animal = new Pescado();
			animal.comer();
			animal.caminar();
			
	}
	public static void JugarConAnimales(Animal animal) {
		if(animal instanceof Mascota) {
			Mascota mascota = (Mascota)animal;
			mascota.jugar();
		} else {
			System.out.println("Peligro! Animal Salvaje");
		}
		JugarConAnimales(araña);
		JugarConAnimales(gato);
		JugarConAnimales(Pescado);
	}
	
	
}

