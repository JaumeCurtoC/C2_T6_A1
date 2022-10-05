package ex3;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		//Declaraci�n de variables
		String n = JOptionPane.showInputDialog("Introduzca un n�mero:");
		
		//Parseo de String a int
		int num = Integer.parseInt(n);
		
		//Llamar al m�todo y pasarlo directamente por el controlador para la salida de datos
		if(calcularPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" es primo.");
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" no es primo.");
		}
	}
	
	public static boolean calcularPrimo(int num) {
		//Indicamos que el n�mero no es 0
		if(num != 0) {
			//Indicamos que el n�mero tampoco es 1
			if(num == 1){
				return true;
			}else {
				//Comprobamos si se puede dividir con cualquier otro n�mero aparte de 1 y el mismo
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
