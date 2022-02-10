package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("How many rooms will be rented? ");
		int stutes = sc.nextInt();
		sc.nextLine();

		Rent[] vect = new Rent[10];

		for (int cont = 1; cont <= stutes; cont++) {
			System.out.println("");
			System.out.println("Rent #" + cont + ":");
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Which room would be your preference? ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			vect[room] = new Rent(name, email, room);
		}

		System.out.println("Busy rooms:");
		for (int cont = 0; cont < vect.length; cont++) {
			if (vect[cont] != null) {
				System.out.println(vect[cont]);
			}
		}

		sc.close();
	}

}
