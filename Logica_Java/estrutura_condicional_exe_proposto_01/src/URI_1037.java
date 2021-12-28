import java.util.Locale;
import java.util.Scanner;

public class URI_1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor1;

		System.out.println("Digite um valor: ");
		valor1 = sc.nextDouble();

		if (valor1 < 0.0 || valor1 > 100.0) {
			System.out.println("Fora do intervalo");
		} else if (valor1 <= 25.0) {
			System.out.println("Intervalo (0,25)");
		} else if (valor1 <= 50.0) {
			System.out.println("Intervalo (25,50)");
		} else if (valor1 <= 75.0) {
			System.out.println("Intervalo (50,75)");
		} else {
			System.out.println("Intervalor (75,100");
		}

		sc.close();

	}

}
