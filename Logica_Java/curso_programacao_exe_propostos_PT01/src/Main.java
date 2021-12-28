import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio para calcular a área de um circulo: ");
		double raio = sc.nextDouble();

		System.out.println("O valor de n = 3.14159");
		double n = 3.14159;

		double A = Math.pow(raio, 2.0);
		double area = n * A;

		System.out.printf("A área do circulo é: %.4f%n ", area);

		sc.close();
	}

}
