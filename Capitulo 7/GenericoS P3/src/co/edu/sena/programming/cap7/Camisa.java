package co.edu.sena.programming.cap7;

public class Camisa implements InventarioContador{
	private String id = "";
	private String descripcion = "";
	private String color = "";
	private String tama�o = "";
	private long contador = 0;
	
	private Camisa() {
		
	}
	
	public Camisa(String id, String descripcion, String color, String tama�o, long contador) {
		this.id = id;
		this.descripcion = descripcion;
		this.color = color;
		this.tama�o = tama�o;
		this.contador = contador;
	}

	public String getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getColor() {
		return color;
	}

	public String getTama�o() {
		return tama�o;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(256);
		sb.append("ID Camisa: ").append(this.getId()).append("\n");
		sb.append("Descripcion: ").append(this.getDescripcion()).append("\n");
		sb.append("Color: ").append(this.getColor()).append("\n");
		sb.append("Tama�o: ").append(this.getTama�o()).append("\n");
		sb.append("Inventario: ").append(this.getContador()).append("\n");
		return sb.toString();
	}
	@Override
	public long getContador() {
		return contador;
	}

	@Override
	public void a�adirIntems(long contador) {
		this.contador = this.contador + contador;
		
	}

	@Override
	public void retirarItems(long contador) {
		if((this.contador - contador) > 0) {
			this.contador = this.contador - contador;
		}else {
			System.out.println("Error de n�mero de inventario negativo");
		}
		
	}
	
}
