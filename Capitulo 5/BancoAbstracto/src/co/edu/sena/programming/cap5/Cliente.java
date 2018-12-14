package co.edu.sena.programming.cap5;

public class Cliente {
	private String primerNombre;
    private String Apellido;
    private TiempoDepositoCuenta[] cuentas;
    private int numeroDeCuentas;

	public Cliente(String p, String a) {
		 primerNombre = p;
	     Apellido = a;
	        
	     cuentas = new TiempoDepositoCuenta[10];
	     numeroDeCuentas = 0;
	}

	

	public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void añadirCuenta(TiempoDepositoCuenta cuenta) {
        int i = numeroDeCuentas++;
        cuentas[i] = cuenta;
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }

    public TiempoDepositoCuenta getCuenta(int cuenta_indice) {
        return cuentas[cuenta_indice];
    }

}
