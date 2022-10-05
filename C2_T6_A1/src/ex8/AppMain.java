package ex8;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de variables
		int[] valores = new int[10];
		
		//En este m�todo introduciremos los valores en la array
		rellenarValores(valores);
		//En este m�todo mostraremos los valores de la array por posici�n
		mostrarValores(valores);
		
	}
	
	public static void rellenarValores(int[] valores) {
		
		//Por cada hueco en la array pediremos un n�mero a introducir
		for (int i = 0; i < valores.length; i++) {
			String n = JOptionPane.showInputDialog("Indique un n�mero que quiera introducir:");
			
			//Parseamos de String a Int
			int num = Integer.parseInt(n);
			
			valores[i] = num;
		}
	}
	
	public static void mostrarValores(int[] valores) {
		
		//Por cada hueco en la array mostrar� una referencia para su posici�n
		System.out.print("( ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(i+1+", ");
		}
		System.out.println(")");
		
		//Con esta funci�n convertiremos un array completo en una l�nea de String ordenada
		System.out.println(Arrays.toString(valores));
	}

}
