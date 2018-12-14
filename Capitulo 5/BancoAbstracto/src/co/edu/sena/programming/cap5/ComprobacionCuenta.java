package co.edu.sena.programming.cap5;

public class ComprobacionCuenta extends Cuenta{
	private final double limiteDescuento;

	public ComprobacionCuenta(double limiteDescuento, double balance) {
		super(balance);
		this.limiteDescuento = limiteDescuento;
	}
	public ComprobacionCuenta(double balance) {
		this(balance, 0);
	}

	@Override
	public String getDescripcion() {
		return "Comprobacion de cuenta";
	}

	@Override
	public boolean whitdraw(double cantidad) {
		if(cantidad <= balance + limiteDescuento) {
			balance += cantidad;
			return true;
		}else {
		return false;
	}
	}
}


