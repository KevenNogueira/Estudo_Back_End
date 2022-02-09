package util;

public class Calculator {

	public static final double PI = 3.14159;

	/* Para se declarar variaveis constantes o padrão e sempre com a letra
	 	maiuscula, e tem que se colocar a palavra FINAL para declarar que esse valor
	  	não muda!
	*/

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
