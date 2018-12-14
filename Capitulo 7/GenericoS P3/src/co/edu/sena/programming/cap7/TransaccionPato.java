package co.edu.sena.programming.cap7;

public class TransaccionPato {
	private String productoID = "";
	private String tipoTransaccion = "";
	private long contador = 0;
	
	
	
	private TransaccionPato() {
		
	}



	private TransaccionPato(String productoID, String tipoTransaccion, long contador) {
		this.productoID = productoID;
		this.tipoTransaccion = tipoTransaccion;
		this.contador = contador;
	}
	 	
	public static TransaccionPato crearTransaccion(String productoID, String tipoTransaccion, long contador) {
		TransaccionPato newTransaccion = new TransaccionPato(productoID, tipoTransaccion, contador);	
		return newTransaccion;
	}

	public String getProductoID() {
		return productoID;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public long getContador() {
		return contador;
	}



	
	
}
