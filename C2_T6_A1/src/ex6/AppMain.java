package ex6;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de variables
		String n = JOptionPane.showInputDialog("Introduzca un n�mero:");

		// Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Comprobamos que num no es negativo o 0
		if(num > 1) {
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" tiene "+ calcularCifras(n)  +" cifras.");
			
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" no es v�lido.");
		}
	}
	
	public static int calcularCifras(String num) {
		//Calculamos el n�mero de cifras a partir de la longitud del String
		int cifra = num.length();
		
		return cifra;
	}

}
