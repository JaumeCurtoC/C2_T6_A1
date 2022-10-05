package ex1;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String seleccion = JOptionPane.showInputDialog("Indique el n�mero de la figura que quiera calcular: (1=circulo, 2=cuadrado, 3=triangulo)");
		
		//Selecci�n del m�todo
		switch (seleccion) {
		case "1":
			calcularCirculo();
			break;
		case "2":
			calcularCuadrado();
			break;
		case "3":
			calcularTriangulo();
			break;

		default:
			System.out.println("Error");
			break;
		}

	}
	
	public static void calcularCirculo() {
		// Declaraci�n de Variables
		String radioS = JOptionPane.showInputDialog("Indique el radio del circulo:");
		
		//Parseo de String a Double
		double radio = Double.parseDouble(radioS);
		
		//C�lculo del resultado
		double resultado = Math.pow(radio, 2)* Math.PI;
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El �rea del c�rculo �s: "+resultado);
		System.out.println("El �rea del c�rculo �s: "+resultado);
		
	}

	public static void calcularCuadrado() {
		// Declaraci�n de Variables
		String l1 = JOptionPane.showInputDialog("Indique cuanto mide el primer lado:");
		String l2 = JOptionPane.showInputDialog("Indique cuanto mide el segundo lado:");
		
		//Parseo de String a Double
		double lado1 = Double.parseDouble(l1);
		double lado2 = Double.parseDouble(l2);
		
		//C�lculo del resultado
		double resultado = (lado1*lado2);
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El �rea del cuadrado �s: "+resultado);
		System.out.println("El �rea del cuadrado �s: "+resultado);
	}
	
	public static void calcularTriangulo() {
		// Declaraci�n de Variables
		String b = JOptionPane.showInputDialog("Indique cuanto mide la base:");
		String a = JOptionPane.showInputDialog("Indique cuanto mide la altura");
		
		//Parseo de String a Double
		double base = Double.parseDouble(b);
		double altura = Double.parseDouble(a);
		
		//C�lculo del resultado
		double resultado = ((base*altura)/2);
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El �rea del triangulo �s: "+resultado);
		System.out.println("El �rea del triangulo es: "+resultado);
		
	}
}
