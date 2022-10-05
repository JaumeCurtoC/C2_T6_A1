package ex1;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String seleccion = JOptionPane.showInputDialog("Indique el número de la figura que quiera calcular: (1=circulo, 2=cuadrado, 3=triangulo)");
		
		//Selección del método
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
		// Declaración de Variables
		String radioS = JOptionPane.showInputDialog("Indique el radio del circulo:");
		
		//Parseo de String a Double
		double radio = Double.parseDouble(radioS);
		
		//Cálculo del resultado
		double resultado = Math.pow(radio, 2)* Math.PI;
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El área del círculo és: "+resultado);
		System.out.println("El área del círculo és: "+resultado);
		
	}

	public static void calcularCuadrado() {
		// Declaración de Variables
		String l1 = JOptionPane.showInputDialog("Indique cuanto mide el primer lado:");
		String l2 = JOptionPane.showInputDialog("Indique cuanto mide el segundo lado:");
		
		//Parseo de String a Double
		double lado1 = Double.parseDouble(l1);
		double lado2 = Double.parseDouble(l2);
		
		//Cálculo del resultado
		double resultado = (lado1*lado2);
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El área del cuadrado és: "+resultado);
		System.out.println("El área del cuadrado és: "+resultado);
	}
	
	public static void calcularTriangulo() {
		// Declaración de Variables
		String b = JOptionPane.showInputDialog("Indique cuanto mide la base:");
		String a = JOptionPane.showInputDialog("Indique cuanto mide la altura");
		
		//Parseo de String a Double
		double base = Double.parseDouble(b);
		double altura = Double.parseDouble(a);
		
		//Cálculo del resultado
		double resultado = ((base*altura)/2);
		
		//Salida de datos
		JOptionPane.showMessageDialog(null, "El área del triangulo és: "+resultado);
		System.out.println("El área del triangulo es: "+resultado);
		
	}
}
