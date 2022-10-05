package ex9;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String n = JOptionPane.showInputDialog("Cuantos valores aleatorios saldrán?");

		// Parseamos de String a Int
		int num = Integer.parseInt(n);

		int[] valoresRandom = new int[num];
		
		//Con este método pondremos los números aleatorios en la array
		rellenarValores(valoresRandom);
		
		//Este método mostrará los valores de la array y hará la suma total de sus valores
		mostrarValores(valoresRandom);

	}

	public static void rellenarValores(int[] num) {
		int min = 0;
		int max = 9;

		// La función random genera un número aleatorio entre dos números que declaramos
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

	}

	public static void mostrarValores(int[] valores) {
		// Con esta función convertiremos un array completo en una línea de String
		// ordenada
		System.out.println(Arrays.toString(valores));
		
		//Declaramos las variables auxiliares y para la suma total
		int n1 = 0;
		int valorTotal = 0;
		
		//Sumamos cada uno de los valores de la array
		for (int i = 0; i < valores.length; i++) {
			n1 = valores[i];
			
			valorTotal = valorTotal + n1;
		}
		
		System.out.println("La suma total es: "+valorTotal);
	}

}
