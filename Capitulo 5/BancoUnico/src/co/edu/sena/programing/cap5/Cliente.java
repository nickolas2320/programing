package co.edu.sena.programing.cap5;

public class Cliente {
    private String primerNombre;
    private String apellido;
    private Cuenta[] cuentas;
    private int numeroDeCuentas;

    public Cliente(String n, String a) {
        primerNombre = n;
        apellido = a;
        
        cuentas = new Cuenta[10];
        numeroDeCuentas = 0;
    }

    public String getPrimerCliente() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void añadirCuenta(Cuenta cuent) {
        int i = numeroDeCuentas++;
        cuentas[i] = cuent;
    }

    public int getNumerDeCuentas() {
        return numeroDeCuentas;
    }

    public Cuenta getCuenta(int cuenta_indice) {
        return cuentas[cuenta_indice];
    }

}
