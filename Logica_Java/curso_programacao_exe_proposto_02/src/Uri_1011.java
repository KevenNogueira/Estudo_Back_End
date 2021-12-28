import java.util.Locale;
import java.util.Scanner;

public class Uri_1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		double volume = 4.0 / 3.0 * pi * Math.pow(raio, 3.0);
		
		System.out.printf("O valume é: %.3f%n", volume);
		
		
		sc.close();

	}

}
