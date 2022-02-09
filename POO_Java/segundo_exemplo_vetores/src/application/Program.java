package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter with the amount of products: ");
		int n = sc.nextInt();
		System.out.println("");
		Product[] vect = new Product[n];
		

		for (int cont = 0; cont < vect.length; cont++) {
			sc.nextLine();
			System.out.printf("Enter the nome of product: ");
			String name = sc.nextLine();
			System.out.printf("Enter the price of product: ");
			double price = sc.nextDouble();
			vect[cont] = new Product(name, price);
			System.out.println("");
		}
		
		double sum = 0.0;
		for (int cont = 0; cont < vect.length; cont++) {
			sum += vect[cont].getPrice();
		}
		
		double avg = sum / vect.length ; 
		
		System.out.printf("Average price = %.2f%n", avg);
		sc.close();

	}

}
