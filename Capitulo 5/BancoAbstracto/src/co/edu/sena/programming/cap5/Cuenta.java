package co.edu.sena.programming.cap5;

public abstract class Cuenta {
	protected double balance;
	public double getBalance() {
        return balance;
    }
    
    public void deposito(double cantidad) {
        balance += cantidad;
    }
    
    @Override
    public String toString() {
        return getDescripcion() + ": saldo actual es " + balance;
    }
    public abstract String getDescripcion();
    public abstract boolean whitdraw(double cantidad);
    
    public Cuenta(double balance) {
    	this.balance = balance;
    }
}  

