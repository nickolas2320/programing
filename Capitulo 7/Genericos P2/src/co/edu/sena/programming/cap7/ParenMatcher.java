package co.edu.sena.programming.cap7;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenMatcher {
	private Deque<Character> stack = new ArrayDeque<>();
	private char [] curLine;
	
	public boolean lineaProcesos(String linea) {
		stack.clear();
		curLine = linea.toCharArray();
		for(char c : curLine){
			switch(c) {
			case '(': stack.push(c);break;	
			case ')':{
				if(stack.size() > 0) {
					stack.pop();
				}else{
					return false;
				}
				break;
			}
			
		}
		if(stack.size() > 0) {
			return false;
		}else {
			return true;
		}
	}
		return true;
	}
	public void procesoArray(String [] lineas) {
		int contador = 0;
		for(String linea: lineas) {
			if(this.lineaProcesos(linea)) {
				System.out.println("Linea " + contador + " es valido");
			}else {
				System.out.println("Linea" + contador + " es invalida");
				
			}
			contador++;
		}
	}
	public static void main(String [] args ) {
		ParenMatcher pm = new ParenMatcher();
		String[] expresiones = new String[4];
		
		expresiones[0] = "if((a == b) && (x != y));";
		expresiones[1] = "if((a == b) && (x != y));";
		expresiones[2] = "if((primerNombre.equals(newPrimerNombre) && (apellido.equals(newApellido));";
		expresiones[3] = "if((primerNombre.equals(newPrimerNombre) && (apellido.equals(newApellido));";
		
		pm.procesoArray(expresiones);
	}
}
