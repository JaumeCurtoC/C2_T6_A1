package ex2;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		
		numRandom();
	}
	
	public static void numRandom() {
		// Declaraci�n de Variables
		// n = el nombre de n�meros aletorios que se generaran
		//r1 y r2 = el rango de n�meros de los cuales se generaran
		String n = JOptionPane.showInputDialog("Indique cuantos n�meros aleatorios quiere:");
		String r1 = JOptionPane.showInputDialog("Indique desde que n�mero quiere randomizar:");
		String r2 = JOptionPane.showInputDialog("Indique hasta que n�mero quiere randomizar:");
		
		//Parseo de String a Integer
		int num = Integer.parseInt(n);
		int min = Integer.parseInt(r1);
		int max = Integer.parseInt(r2);
		
		//Creaci�n del array donde guardaremos los n�meros generados
		int random[] = new int[num];
		
		//Generamos los n�meros aleatorios y los guardamos en la array
		for (int i = 0; i < random.length; i++) {
			random[i] = generarRandom(min, max);
		}
		
		//Salida de datos del array
		System.out.println("N�meros aleatorios generados:");
		for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}
		
	}
	
	public static int generarRandom(int min, int max) {
		//La funci�n random genera un n�mero aleatorio entre dos n�meros que declaramos
		int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		//Retornamos el n�mero generado
		return randomNum;
	}

}
