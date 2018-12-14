package co.edu.sena.programing.cap5;

public class CuentaCorriente {
private final double LimiteDescuento;
    
    public ComprobarCuenta(double balance) {
        this(balance, 0);
    }
    
    public ComprobarCuenta(double balance, double LimiteDescuento) {
        super(balance);
        this.LimiteDescuento = LimiteDescuento;
    }

    @Override
    public boolean withdraw(double cantidad) {
        if(cantidad <= balance + LimiteDescuento) {
            balance -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public String getDescripcion() {
        return "Comprobando Cuenta";
    }
    

}
