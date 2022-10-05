package ex9;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String n = JOptionPane.showInputDialog("Cuantos valores aleatorios saldr�n?");

		// Parseamos de String a Int
		int num = Integer.parseInt(n);

		int[] valoresRandom = new int[num];
		
		//Con este m�todo pondremos los n�meros aleatorios en la array
		rellenarValores(valoresRandom);
		
		//Este m�todo mostrar� los valores de la array y har� la suma total de sus valores
		mostrarValores(valoresRandom);

	}

	public static void rellenarValores(int[] num) {
		int min = 0;
		int max = 9;

		// La funci�n random genera un n�mero aleatorio entre dos n�meros que declaramos
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

	}

	public static void mostrarValores(int[] valores) {
		// Con esta funci�n convertiremos un array completo en una l�nea de String
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
