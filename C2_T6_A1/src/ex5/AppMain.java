package ex5;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de variables
		String n = JOptionPane.showInputDialog("Introduzca un número:");

		// Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Salida de datos con llamada al método
		JOptionPane.showMessageDialog(null, "El binario de "+num+" es: " + calcularBinario(num));

	}
	
	public static String calcularBinario(int num) {
		//Usamos directamente la función de Java
		return Integer.toBinaryString(num);
	}

}
