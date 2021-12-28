import java.util.Scanner;

public class Uri_1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int A = sc.nextInt();
		
		System.out.println("Digite mais um numero inteiro para que este seja somado ao anterior: ");
		int B = sc.nextInt();

		int soma = A + B;

		System.out.println("A soma dos valores é: " + soma);

		sc.close();

	}

}
