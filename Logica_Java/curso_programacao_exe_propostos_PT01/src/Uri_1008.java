import java.util.Locale;
import java.util.Scanner;

public class Uri_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ID do funcionario que deseja saber.");
		int funcionario = sc.nextInt();

		System.out.println("Digite a quantidade de horas extras feitas.");
		int horas = sc.nextInt();

		System.out.println("Digite o valor que e pago por hora extra:");
		double extra = sc.nextDouble();

		double salario_extra = horas * extra;
		System.out.printf("O ID " + funcionario);
		System.out.printf(" Tem " + horas + " horas extras na firma.");
		System.out.printf(" Tendo que receber: R$ %.2f%n ", salario_extra);
		sc.close();

	}

}
