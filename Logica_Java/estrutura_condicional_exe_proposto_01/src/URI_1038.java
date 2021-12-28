import java.util.Scanner;

public class URI_1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;

		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();

		System.out.println("Digite o quantidade do produto:");
		quantidade = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.50;
		}

		System.out.printf("O total a pagar é: R$%.2f%n", total);
		sc.close();
	}

}
