import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < c) {
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}


		sc.close();

	}

}
