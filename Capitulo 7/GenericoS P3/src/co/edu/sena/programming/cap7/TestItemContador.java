package co.edu.sena.programming.cap7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestItemContador {
	public static void main(String[] args) {
        Camisa camisaCorriente = null;

        Map<String, Camisa> polos = new HashMap<>(10);
        polos.put("P001", new Camisa("P001", "Blue Polo Shirt", "Blue", "L", 0));
        polos.put("P002", new Camisa("P002", "Black Polo Shirt", "Black", "M", 0));
        polos.put("P003", new Camisa("P003", "Maroon Polo Shirt", "Maroon", "XL", 0));
        polos.put("P004", new Camisa("P004", "Tan Polo Shirt", "Tan", "S", 0));

        // Transactions
        List<TransaccionPato> transactions = new ArrayList<>(20);
        transactions.add(TransaccionPato.crearTransaccion("P001", "Purchase", 30));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Purchase", 20));
        transactions.add(TransaccionPato.crearTransaccion("P003", "Purchase", 20));
        transactions.add(TransaccionPato.crearTransaccion("P004", "Purchase", 20));
        transactions.add(TransaccionPato.crearTransaccion("P001", "Sale", 1));
        transactions.add(TransaccionPato.crearTransaccion("P001", "Sale", 2));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Sale", 5));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Sale", 1));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Sale", 2));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Sale", 2));
        transactions.add(TransaccionPato.crearTransaccion("P002", "Purchase", 5));
        transactions.add(TransaccionPato.crearTransaccion("P001", "Sale", 3));
        transactions.add(TransaccionPato.crearTransaccion("P003", "Sale", 2));
        transactions.add(TransaccionPato.crearTransaccion("P003", "Purchase", 5));
        transactions.add(TransaccionPato.crearTransaccion("P003", "Sale", 3));
        transactions.add(TransaccionPato.crearTransaccion("P004", "Sale", 2));
        transactions.add(TransaccionPato.crearTransaccion("P004", "Purchase", 5));
        transactions.add(TransaccionPato.crearTransaccion("P004", "Sale", 4));
	}		
}
