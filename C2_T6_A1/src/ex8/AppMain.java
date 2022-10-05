package ex8;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de variables
		int[] valores = new int[10];
		
		//En este método introduciremos los valores en la array
		rellenarValores(valores);
		//En este método mostraremos los valores de la array por posición
		mostrarValores(valores);
		
	}
	
	public static void rellenarValores(int[] valores) {
		
		//Por cada hueco en la array pediremos un número a introducir
		for (int i = 0; i < valores.length; i++) {
			String n = JOptionPane.showInputDialog("Indique un número que quiera introducir:");
			
			//Parseamos de String a Int
			int num = Integer.parseInt(n);
			
			valores[i] = num;
		}
	}
	
	public static void mostrarValores(int[] valores) {
		
		//Por cada hueco en la array mostraré una referencia para su posición
		System.out.print("( ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(i+1+", ");
		}
		System.out.println(")");
		
		//Con esta función convertiremos un array completo en una línea de String ordenada
		System.out.println(Arrays.toString(valores));
	}

}
