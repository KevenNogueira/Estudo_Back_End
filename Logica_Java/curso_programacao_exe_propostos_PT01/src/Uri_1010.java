import java.util.Locale;
import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do iten:");
		int n1 = sc.nextInt();
		System.out.println("Digite o codigo do iten2:");
		int n2 = sc.nextInt();
		System.out.println("Digite a quantidade do iten:");
		int qunt1 = sc.nextInt();
		System.out.println("Digite a quantidade do iten2:");
		int qunt2 = sc.nextInt();
		System.out.println("Digite o valor do iten1: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o valor do iten2: ");
		double valor2 = sc.nextDouble();
		
		double total = (qunt1 * valor1) + (qunt2 * valor2);
		System.out.printf("Valor a pegar: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
