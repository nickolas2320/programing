package co.edu.sena.programming.cap5;

import java.sql.Date;

public class TiempoDepositoCuenta extends Cuenta{
	
    private final Date fechaVencimiento;
    
    public TiempoDepositoCuenta(double balance, Date date) {
    	super(balance);
        this.fechaVencimiento = date;
	}

	

    public boolean withdraw(double cantidad) {
        Date hoy = new Date(0);
        if(hoy.after(fechaVencimiento)) {
            if(cantidad <= balance) {
                balance -= cantidad;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getDescripcion() {
        return "Cuenta de Depósito a Plazo" + fechaVencimiento;
    }



	@Override
	public boolean whitdraw(double cantidad) {
		// TODO Auto-generated method stub
		return false;
	}

}
