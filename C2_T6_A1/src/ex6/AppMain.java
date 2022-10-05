package ex6;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de variables
		String n = JOptionPane.showInputDialog("Introduzca un número:");

		// Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Comprobamos que num no es negativo o 0
		if(num > 1) {
			JOptionPane.showMessageDialog(null, "El número "+num+" tiene "+ calcularCifras(n)  +" cifras.");
			
		}else {
			JOptionPane.showMessageDialog(null, "El número "+num+" no es válido.");
		}
	}
	
	public static int calcularCifras(String num) {
		//Calculamos el número de cifras a partir de la longitud del String
		int cifra = num.length();
		
		return cifra;
	}

}
