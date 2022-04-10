package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of lines that the array will have:");
		int lineMatriz = sc.nextInt();

		System.out.print("Entre the nunmber of columns taht the array will have:");
		int columnsMatriz = sc.nextInt();

		int[][] matriz = new int[lineMatriz][columnsMatriz];

		System.out.println("Fill in the matrix data: ");
		for (int i = 0; i < lineMatriz; i++) {
			for (int j = 0; j < columnsMatriz; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("Enter a number to search for any incidence: ");
		int num = sc.nextInt();

		for (int i = 0; i < lineMatriz; i++) {
			for (int j = 0; j < columnsMatriz; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();

	}

}
