package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the number of people that will be stored in the vector ? ");
		int number_people = sc.nextInt();
		double[] vect = new double[number_people];

		for (int cont = 0; cont < number_people; cont++) {
			System.out.println("Enter the person's height: ");
			vect[cont] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int cont = 0; cont < number_people; cont++) {
			sum = vect[cont];
		}
		double avg = sum / number_people;

		System.out.printf("Average Height: %.2f%n", avg);

		sc.close();

	}

}
