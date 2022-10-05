package ex10;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String n = JOptionPane.showInputDialog("Cuantos valores aleatorios saldr�n?");

		// Parseamos de String a Int
		int num = Integer.parseInt(n);

		int[] valoresRandom = new int[num];

		//Este m�todo rellenar� la array con valores aleatorios y comprobara que son n�meros primos
		rellenarValores(valoresRandom);

		// Este m�todo mostrar� los valores de la array y dir� cual es el mayor entre ellos
		mostrarValores(valoresRandom);

	}

	public static void rellenarValores(int[] num) {
		int min = 1;
		int max = 100;
		int i = 0;
		
		//Mientras el �ltimo valor de la array sea 0 (no se haya llenado con un valor aleatorio), seguir� generando n�meros
		while (num[num.length - 1] == 0) {
			
			boolean comprobarPrimo = true;
			// La funci�n random genera un n�mero aleatorio entre dos n�meros que declaramos
			int n1 = (int) Math.floor(Math.random() * (max - min + 1) + min);

			if (n1 == 1) {
				num[i] = n1;
				i++;
			} else {
				// Comprobamos si se puede dividir con cualquier otro n�mero aparte de 1 y el
				// mismo
				for (int j = 2; j < n1; j++) {
					if (n1 % j == 0) {
						comprobarPrimo = false;
					}
				}
				//Si la variable es true, a�adiremos el n�mero a la array
				if (comprobarPrimo) {
					num[i] = n1;
					i++;
				}

			}
		}

	}

	public static void mostrarValores(int[] valores) {
		int mayor = 0;
		
		// Con esta funci�n convertiremos un array completo en una l�nea de String
		// ordenada
		System.out.println("Valores aleatorios de la array: "+Arrays.toString(valores));
		
		//Comprobamos cual de los n�meros de la array es mayor
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > mayor) {
				mayor = valores[i];
			}
		}
		
		System.out.println("El valor m�s grande es: "+mayor);
	}

}
