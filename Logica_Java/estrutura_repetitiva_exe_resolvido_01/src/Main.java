import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1° valor: ");
		int x = sc.nextInt();
		System.out.println("Digite 2° valor: ");
		int y = sc.nextInt();

		while (x != y) {
			if (x < y) {
				System.out.println("Crescente!");
			} else {
				System.out.println("Decresente!");
			}
			System.out.println("Digite novamente 1° valor: ");
			x = sc.nextInt();
			System.out.println("Digite novamente 2° valor: ");
			y = sc.nextInt();
		}
		System.out.println("Os valores digitados foram iguais, programa finalizado!");
		sc.close();

	}

}
