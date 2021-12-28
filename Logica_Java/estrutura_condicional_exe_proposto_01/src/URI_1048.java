import java.util.Locale;
import java.util.Scanner;

public class URI_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, novoSalario, percentual, reajuste;
		System.out.println("Digite o valor do salario: ");
		salario = sc.nextFloat();

		if (salario <= 400.0) {
			percentual = 15.0;
		} else if (salario <= 800.0) {
			percentual = 12.0;
		} else if (salario <= 1200.0) {
			percentual = 10.0;
		} else if (salario < -2000.0) {
			percentual = 7.0;
		} else {
			percentual = 4.0;
		}

		reajuste = salario * percentual / 100.0; 
		novoSalario = salario + reajuste; 
		
		System.out.printf("O novo salario é R$ %.2f%n", novoSalario);
		System.out.printf("O valor de reajuste é: R$ %.2f%n", reajuste);
		System.out.println("O percentual almetado é: " + percentual + "%");
		sc.close();

	}

}
