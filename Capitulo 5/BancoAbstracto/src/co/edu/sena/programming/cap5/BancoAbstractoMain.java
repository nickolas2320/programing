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
        
        banco.a�adirCliente("Cristian", "Tirano");
        cliente = banco.getCliente(0);
        cliente.a�adirCuenta(new TiempoDepositoCuenta(500.00, cal.getTime()));
        cliente.a�adirCuenta(new ComprobacionCuenta(200.00, 400.00));
        
        banco.a�adirCliente("Nicolas", "Rodriguez");
        cliente = banco.getCliente(1);
        cliente.a�adirCuenta(new ComprobacionCuenta(200.00));
        
        banco.a�adirCliente("Juan", "Gomez");
        cliente = banco.getCliente(2);
        cliente.a�adirCuenta(new TiempoDepositoCuenta(1500.00, cal.getTime()));
        cliente.a�adirCuenta(new ComprobacionCuenta(200.00));
        
        banco.a�adirCliente("Jennifer", "Cruz");
        cliente = banco.getCliente(3);
        cliente.a�adirCuenta(banco.getCliente(2).getCuenta(1));
        cliente.a�adirCuenta(new TiempoDepositoCuenta(150.00, cal.getTime()));

}
}
