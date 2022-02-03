package program;

import java.util.Locale;
import java.util.Scanner;

import entiry.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee fun01 = new Employee();

		System.out.println("Digite o nome do funcionario: ");
		fun01.name = sc.nextLine();

		System.out.println("Digite o salario bruto do funcionario: ");
		fun01.grossSalary = sc.nextDouble();

		System.out.println("Digite o imposto cobrado pelo funcionario: ");
		fun01.tax = sc.nextDouble();

		System.out.println("Name: " + fun01.name);
		System.out.printf("Gross salary: %.2f%n", fun01.grossSalary);
		System.out.printf("Tax: %.2f%n", fun01.tax);

		System.out.println("");
		System.out.println("Employee: " + fun01);

		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		fun01.increaseSalary(porcentagem);

		System.out.println("");
		System.out.println("Updated data : " + fun01);

		sc.close();

	}

}
