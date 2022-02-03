import java.util.Scanner;

public class OperadoresBitWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para compração bit a bit: ");

		int n1 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");

		int n2 = sc.nextInt();

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		sc.close();
	}

}
