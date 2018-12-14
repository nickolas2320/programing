package co.edu.sena.programming.cap5;

public class ClienteReporte {
	private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void generarReporte() {

        System.out.println("\t\t\tinforme de clientesT");
        System.out.println("\t\t\t================");

        for (int cli_ind = 0; cli_ind < banco.getNumeroDeClientes(); cli_ind++) {
            Cliente cliente = banco.getCliente(cli_ind);

            System.out.println();
            System.out.println("Cliente: "
                    + cliente.getApellido() + ", "
                    + cliente.getPrimerNombre()());

            for (int cuent_ind = 0; cuent_ind < cliente.getNumeroDeCuentas(); cuent_ind++) {
                TiempoDepositoCuenta cuenta = cliente.getCuenta(cuent_ind);

               
                System.out.println("    " + cuenta);
            }
        }
    }

}
