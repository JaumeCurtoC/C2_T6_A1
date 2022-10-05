package ex7;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		
		pasarDivisa();

	}

	public static void pasarDivisa() {
		// Declaración de variables
		String n = JOptionPane.showInputDialog("Introduzca el número de euros:");
		String d = JOptionPane.showInputDialog("A que divisa la quiere pasar? (1: libra, 2: dolar, 3: yen)");
		
		//El valor de las divisas no se pueden alterar en el código.
		final double DIVISAS[] = {0.86, 1.28611, 129.852};

		// Parseo de String a double
		double num = Double.parseDouble(n);
		
		//Puedes elegir escribir el número o el nombre de la divisa
		switch (d) {
		case "1":
			 num = num * DIVISAS[0];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" libras.");
			break;
		case "2":
			 num = num * DIVISAS[1];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" dolares.");
			break;
		case "3":
			 num = num * DIVISAS[2];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" yenes.");
			break;
		case "libra":
			 num = num * DIVISAS[0];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" libras.");
			break;
		case "dolar":
			 num = num * DIVISAS[1];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" dolares.");
			break;
		case "yen":
			 num = num * DIVISAS[2];
			 JOptionPane.showMessageDialog(null, n+ " euros són "+num+" yenes.");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Error");
			break;
		}
		
		
		
		
		
		
		
	}

}
