package ex3;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		//Declaración de variables
		String n = JOptionPane.showInputDialog("Introduzca un número:");
		
		//Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Llamar al método y pasarlo directamente por el controlador para la salida de datos
		if(calcularPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El número "+num+" es primo.");
		}else {
			JOptionPane.showMessageDialog(null, "El número "+num+" no es primo.");
		}
	}
	
	public static boolean calcularPrimo(int num) {
		//Indicamos que el número no es 0
		if(num != 0) {
			//Indicamos que el número tampoco es 1
			if(num == 1){
				return true;
			}else {
				//Comprobamos si se puede dividir con cualquier otro número aparte de 1 y el mismo
				for (int i = 2; i < num; i++) {
					if(num%i==0) {
						return false;
					}else {
						return true;
					}
				}
			}
		}else {
			
			return false;
		}
		//Este return debe estar para no provocar un error
		return false;
	}

}
