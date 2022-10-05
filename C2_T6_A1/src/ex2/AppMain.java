package ex2;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		
		numRandom();
	}
	
	public static void numRandom() {
		// Declaración de Variables
		// n = el nombre de números aletorios que se generaran
		//r1 y r2 = el rango de números de los cuales se generaran
		String n = JOptionPane.showInputDialog("Indique cuantos números aleatorios quiere:");
		String r1 = JOptionPane.showInputDialog("Indique desde que número quiere randomizar:");
		String r2 = JOptionPane.showInputDialog("Indique hasta que número quiere randomizar:");
		
		//Parseo de String a Integer
		int num = Integer.parseInt(n);
		int min = Integer.parseInt(r1);
		int max = Integer.parseInt(r2);
		
		//Creación del array donde guardaremos los números generados
		int random[] = new int[num];
		
		//Generamos los números aleatorios y los guardamos en la array
		for (int i = 0; i < random.length; i++) {
			random[i] = generarRandom(min, max);
		}
		
		//Salida de datos del array
		System.out.println("Números aleatorios generados:");
		for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}
		
	}
	
	public static int generarRandom(int min, int max) {
		//La función random genera un número aleatorio entre dos números que declaramos
		int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		//Retornamos el número generado
		return randomNum;
	}

}
