package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many functionary wil be registered? ");
		int functionary = sc.nextInt();

		for (int cont = 1; cont <= functionary; cont++) {
			System.out.println("");
			System.out.println("Functionary #: " + cont + ": ");

			System.out.print("Enter the functionary ID: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("ID already taken, Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Enter the employee's name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter the employee's salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));

		}

		System.out.println("");
		System.out.print("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println("");
		System.out.println("List of empoyees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
