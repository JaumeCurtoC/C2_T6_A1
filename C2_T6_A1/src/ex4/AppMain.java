package ex4;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		//Declaraci�n de variables
		String n = JOptionPane.showInputDialog("Introduzca un n�mero:");
				
		//Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Salida de datos con llamada al m�todo
		JOptionPane.showMessageDialog(null, "El factorial de "+num+" es: "+ calcularFactorial(num));

	}
	
	public static int calcularFactorial(int num) {
		//Guardamos num en una variable local para evitar problemas
		int facto = num;
		
		//Iremos calculando el factorial con cada rotaci�n del for, que hara una multiplicaci�n sobre facto
		for (int i = (num-1); i > 0; i--) {
			facto = facto*i;
		}
		
		return facto;
	}
	
	

}
