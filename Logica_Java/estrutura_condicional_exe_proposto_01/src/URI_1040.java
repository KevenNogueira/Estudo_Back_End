import java.util.Locale;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, media;

		System.out.println("Digite 1° nota: ");
		n1 = sc.nextFloat();
		System.out.println("Digite 2° nota: ");
		n2 = sc.nextFloat();
		System.out.println("Digite a 3° nota: ");
		n3 = sc.nextFloat();
		System.out.println("Digite a 4° nota: ");
		n4 = sc.nextFloat();

		media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;

		System.out.printf("A média é: %.1f%n", media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado!");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado!");
		} else if (media >= 5.0 || media <= 6.9) {
			System.out.println("Aluno em exame.");
			System.out.println("Digite a nota do exame: ");
			float nota = sc.nextFloat();
			System.out.printf("A nota é: %.1f%n", nota);
			media = (media + nota) / 2;
		}
		if (media >= 5.0) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		System.out.printf("Media: %.1f%n", media);

		sc.close();
	}

}
