package co.edu.sena.programming.cap7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContadorProducto {
	private Map<String, Long> contadorProductoMap = new HashMap<>();
	private static Map<String, String> nombreProductos = new TreeMap<>();
	
	public static void main(String[] args) {
		
		
		 String [] partes = new String[] {"1S01", "1S01", "1S01", 
				 "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", 
				 "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", 
				 "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"
		 };
		 
		 Map<String, String> nombreProductos = new TreeMap<>();
		 nombreProductos.put("Camiseta Polo Azul", "1S01");
		 nombreProductos.put("Camiseta Polo Negra", "1S02");
		 nombreProductos.put("Gorra Roja", "1H01");
		 nombreProductos.put("Jean Dark", "1M02");
		 
		 ContadorProducto cp1 = new ContadorProducto(nombreProductos);
		 cp1.listaProceso(partes);
		 cp1.impresionReporte();
	}
	
	
	
	public ContadorProducto(Map nombreProductos) {
		this.nombreProductos = nombreProductos;
	}
	
	public void listaProceso(String[] list) {
		long curVal = 0;
		for(String numeroItem: list) {
			if(contadorProductoMap.containsKey(numeroItem)) {
				curVal = contadorProductoMap.get(numeroItem);
				curVal++;
				contadorProductoMap.put(numeroItem, new Long(curVal));
				
			}else {
				contadorProductoMap.put(numeroItem, new Long(1));
			}
		}
	}
			
	
	public void impresionReporte() {
		System.out.println(" === informe del producto === ");
		for(String key: nombreProductos.keySet()) {
			System.out.println("Nombre: " + key);
			System.out.println("t\tConteo: " + contadorProductoMap.get(nombreProductos.get(key)));
		}
		
		
	}
	
	}
	
	



