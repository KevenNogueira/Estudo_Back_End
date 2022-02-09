package util;

public class Currency_Converter {

	public  static double conversion(double dollar, double price) {
		double total = dollar * price; 
		double porcento = total * 6 / 100; 
		return total + porcento;
		
	}
	
}
