package co.edu.sena.programming.cap6;

public class MascotaMain {
	public static void main(String [] args) {
		Animal animal;
		Ara�a ara�a = new Ara�a();
		ara�a.comer();
		ara�a.caminar();
		animal = new Ara�a();
		animal.comer();
		animal.caminar();
		
		Mascota mascota;
		
		Gato gato = new Gato("Tom");
		gato.comer();
		gato.caminar();
		gato.jugar();
		animal = new Gato();
		animal.comer();
		animal.caminar();
		mascota = new Gato();
		mascota.setNombre("Dr. Magolito");
		mascota.jugar();
		
		Pescado pescado = new Pescado();
		pescado.setNombre("Goldy");
		pescado.comer();
		pescado.caminar();
		pescado.jugar();
		animal = new Pescado();
		animal.comer();
		animal.caminar();
		
		jugarConAnimales(ara�a);
		jugarConAnimales(gato);
		jugarConAnimales(pescado);
	}
	public static void jugarConAnimales(Animal animal) {
		if(animal instanceof Mascota) {
			Mascota mascota = (Mascota) animal;
			mascota.jugar();
		}else {
			System.out.println("Cuidado!!! Animal peligroso");
		}
	}
	
}
