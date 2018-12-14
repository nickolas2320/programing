package co.edu.sena.programing.cap5;

public class Banco {
	private Cliente[] clientes;
    private int numeroDecClientes;

    public Banco() {
        clientes = new Cliente[10];
        numeroDecClientes = 0;
    }

    public void añadirClientes(String n, String a) {
        int i = numeroDecClientes++;
        clientes[i] = new Cliente(n, a);
    }

    public int getNumerDeClientes() {
        return numeroDecClientes;
    }

    public Cliente getCliente(int cliente_indice) {
        return clientes[cliente_indice];
    }

}
