package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the matrix you want.");
		int sizeMatrix = sc.nextInt();
		int[][] matrix = new int[sizeMatrix][sizeMatrix];

		for (int i = 0; i < sizeMatrix; i++) {
			for (int j = 0; j < sizeMatrix; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < sizeMatrix; i++) {
			System.out.print(matrix[i][i] + " ");
		}

		System.out.println();

		int count = 0;
		for (int i = 0; i < sizeMatrix; i++) {
			for (int j = 0; j < sizeMatrix; j++) {
				if (matrix[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();
	}

}
