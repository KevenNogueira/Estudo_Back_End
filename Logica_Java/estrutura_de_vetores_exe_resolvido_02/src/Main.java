import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		System.out.printf("%.2f%n", soma);

		double media = soma / n;
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}
