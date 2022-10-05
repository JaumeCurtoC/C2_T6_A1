package ex11;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String t = JOptionPane.showInputDialog("Indica el tamaño de las arrays:");
		
		//Parseo de String a int
		int tam = Integer.parseInt(t);
		
		//Declaración de las variables
		int array1[] = new int[tam];
		int array2[] = new int[tam];

		//Rellenamos el array1 con valores aleatorios
		rellenarValores(array1);
		
		//Clonamos el contenido del array1 a array2
		array2 = array1.clone();
		
		//Cambiamos las entradas de array2 por otras aleatorias
		rellenarValores(array2);

		//Guardamos el resultado de multiplicar las entradas de ambas arrays
		int arrayMulti[] = multiplicarArrays(array1, array2);
		
		//Salida de datos
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Array Multiplicación: " + Arrays.toString(arrayMulti));

	}

	public static void rellenarValores(int[] array) {
		//Valores de referencia para randomizar
		int min = 1;
		int max = 100;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

	}

	public static int[] multiplicarArrays(int[] array1, int[] array2) {

		int arrayMulti[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			arrayMulti[i] = (array1[i] * array2[i]);

		}

		return arrayMulti;

	}

}
