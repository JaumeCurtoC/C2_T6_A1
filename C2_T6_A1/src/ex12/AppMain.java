package ex12;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String t = JOptionPane.showInputDialog("Indica el tamaño de la array:");

		// Parseo de String a int
		int tam = Integer.parseInt(t);

		// Declaración de las variables
		int array1[] = new int[tam];
		
		//Rellenamos el array1 con valores aleatorios
		rellenarValores(array1);
		
		//Con este método, filtraremos la array y la mostraremos
		filtrarValores(array1);
	}

	public static void rellenarValores(int[] array) {
		//Valores de referencia para randomizar
		int min = 1;
		int max = 300;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
		}

	}
	
	public static void filtrarValores(int[] array) {
		boolean b = false;
		String f = "";
		while (!b) {
			f = JOptionPane.showInputDialog("Indique el dígito con el que terminarán los números");
			int filtro = Integer.parseInt(f);
			
			if(filtro > 0 || filtro < 10) {
				b = true;
			}else {
				JOptionPane.showMessageDialog(null, "Dígito incorrecto");
			}
		}
		
		ArrayList<Integer> filtrada = new ArrayList<>();
		
		//Filtramos cada número dentro de la array, comparando el último de sus dígitos con el que usamos como filtro
		for (int i = 0; i < array.length; i++) {
			String d = String.valueOf(array[i]);
			if(d.endsWith(f)) {
				filtrada.add(array[i]);
			}
		}
		
		//Salida de datos
		System.out.println("Array Original:");
		System.out.println(Arrays.toString(array));
		
		System.out.println("Array filtrada: ");
		for (Object o:filtrada) {
			System.out.print(o+", ");
		}
	}
}
