import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal Principal: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");

		}
		System.out.println();
		int cont = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Quantidade de negativos ?: " + cont);
		sc.close();
	}

}
