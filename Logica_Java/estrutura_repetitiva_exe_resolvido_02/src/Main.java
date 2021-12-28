import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, soma = 0, cont = 0;

		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade >= 0) {

			soma = soma + idade;
			cont = cont + 1;
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();

		}

		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("A média é: %.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}

		sc.close();
	}

}
