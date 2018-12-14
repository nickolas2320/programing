package co.edu.sena.programing.cap5;

public abstract class Cuenta {
protected double balance;
    
    public Cuenta(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposito(double cantidad) {
        balance += cantidad;
    }
    
    @Override
    public String toString() {
        return getDescripcion() + "su saldo actual es:  " + balance;
    }
    
    public abstract boolean withdraw(double cuenta);
    
    public abstract String getDescripcion();
    

}
