package program;

import java.util.Locale;
import java.util.Scanner;

import Entity.Rectangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle r1 = new Rectangle();

		System.out.println("Entre com o valor correspondente a altura do retangulo: ");
		r1.altura = sc.nextDouble();

		System.out.println("Entre com o valor correspondente a largura do retangulo ");
		r1.largura = sc.nextDouble();

		System.out.printf("O valor da área é: %.2f%n", r1.area());

		System.out.printf("O periemtro do retangulo é: %.2f%n", r1.perimeter());

		System.out.printf("A diagonal é: %.2f%n", r1.diagonal());
		sc.close();

	}

}
