package ex10;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String n = JOptionPane.showInputDialog("Cuantos valores aleatorios saldrán?");

		// Parseamos de String a Int
		int num = Integer.parseInt(n);

		int[] valoresRandom = new int[num];

		//Este método rellenará la array con valores aleatorios y comprobara que son números primos
		rellenarValores(valoresRandom);

		// Este método mostrará los valores de la array y dirá cual es el mayor entre ellos
		mostrarValores(valoresRandom);

	}

	public static void rellenarValores(int[] num) {
		int min = 1;
		int max = 100;
		int i = 0;
		
		//Mientras el último valor de la array sea 0 (no se haya llenado con un valor aleatorio), seguirá generando números
		while (num[num.length - 1] == 0) {
			
			boolean comprobarPrimo = true;
			// La función random genera un número aleatorio entre dos números que declaramos
			int n1 = (int) Math.floor(Math.random() * (max - min + 1) + min);

			if (n1 == 1) {
				num[i] = n1;
				i++;
			} else {
				// Comprobamos si se puede dividir con cualquier otro número aparte de 1 y el
				// mismo
				for (int j = 2; j < n1; j++) {
					if (n1 % j == 0) {
						comprobarPrimo = false;
					}
				}
				//Si la variable es true, añadiremos el número a la array
				if (comprobarPrimo) {
					num[i] = n1;
					i++;
				}

			}
		}

	}

	public static void mostrarValores(int[] valores) {
		int mayor = 0;
		
		// Con esta función convertiremos un array completo en una línea de String
		// ordenada
		System.out.println("Valores aleatorios de la array: "+Arrays.toString(valores));
		
		//Comprobamos cual de los números de la array es mayor
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > mayor) {
				mayor = valores[i];
			}
		}
		
		System.out.println("El valor más grande es: "+mayor);
	}

}
