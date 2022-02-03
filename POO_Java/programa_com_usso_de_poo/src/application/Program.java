package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com o valor correspondente aos lados do triangulo X : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com o valor correspondente aos lados do triangulo Y : ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A �rea do triangulo X � : %.4f%n", areaX);
		System.out.printf("A �rea do triangulo Y � : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O triangulo X tem a maior �rea!");
		} else {
			System.out.println("O trinagulo Y tem a maior �rea!");
		}
		sc.close();

	}

}
