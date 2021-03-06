package application;

import java.util.Locale;
import java.util.Scanner;

import util.Currency_Converter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?  ");
		double dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", Currency_Converter.conversion(dollar, price));
		
		
		sc.close();

	}

}
