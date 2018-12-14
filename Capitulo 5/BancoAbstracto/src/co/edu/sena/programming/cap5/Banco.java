package co.edu.sena.programming.cap5;

public class Banco {
	private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco() {
        clientes = new Cliente[10];
        numeroDeClientes = 0;
    }

    public void añadirCliente(String p, String a) {
        int i = numeroDeClientes++;
        clientes[i] = new Cliente(p, a);
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public Cliente getCliente(int cliente_indice) {
        return clientes[cliente_indice];
    }

}
