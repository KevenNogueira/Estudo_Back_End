package curso_programacao_exercicio_001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura do terreno");
		double largura = sc.nextDouble();

		System.out.println("Digite o comprimento do terreno");
		double comprimento = sc.nextDouble();

		System.out.println("Digite o valor do metro quadrado do terreno");
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("A �rea de seu terrono �: %.2f%n", area);

		System.out.printf("Valor total do terreno �: %.2f%n", preco);

		sc.close();

	}

}
