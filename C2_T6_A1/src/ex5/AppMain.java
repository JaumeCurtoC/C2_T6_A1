package ex5;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de variables
		String n = JOptionPane.showInputDialog("Introduzca un n�mero:");

		// Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Salida de datos con llamada al m�todo
		JOptionPane.showMessageDialog(null, "El binario de "+num+" es: " + calcularBinario(num));

	}
	
	public static String calcularBinario(int num) {
		//Usamos directamente la funci�n de Java
		return Integer.toBinaryString(num);
	}

}
