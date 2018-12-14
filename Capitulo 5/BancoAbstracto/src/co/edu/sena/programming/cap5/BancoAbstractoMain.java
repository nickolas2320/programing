package co.edu.sena.programming.cap5;

import java.util.Calendar;

public class BancoAbstractoMain {
	public static void main(String[] args) {
        Banco banco = new Banco();
        inicializarCliente(banco);
        
        ClienteReporte report = new ClienteReporte();
        report.setBanco(banco);
        report.generarReporte();
    }

    private static void inicializarCliente(Banco banco) {
        Cliente cliente;
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 180);
        
        banco.añadirCliente("Cristian", "Tirano");
        cliente = banco.getCliente(0);
        cliente.añadirCuenta(new TiempoDepositoCuenta(500.00, cal.getTime()));
        cliente.añadirCuenta(new ComprobacionCuenta(200.00, 400.00));
        
        banco.añadirCliente("Nicolas", "Rodriguez");
        cliente = banco.getCliente(1);
        cliente.añadirCuenta(new ComprobacionCuenta(200.00));
        
        banco.añadirCliente("Juan", "Gomez");
        cliente = banco.getCliente(2);
        cliente.añadirCuenta(new TiempoDepositoCuenta(1500.00, cal.getTime()));
        cliente.añadirCuenta(new ComprobacionCuenta(200.00));
        
        banco.añadirCliente("Jennifer", "Cruz");
        cliente = banco.getCliente(3);
        cliente.añadirCuenta(banco.getCliente(2).getCuenta(1));
        cliente.añadirCuenta(new TiempoDepositoCuenta(150.00, cal.getTime()));

}
}
