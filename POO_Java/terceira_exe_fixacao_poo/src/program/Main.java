package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		System.out.println("Digite o nome do aluno:");
		aluno.name = sc.nextLine();

		System.out.println("Digite a nota referente ao 1° trimestre: ");
		aluno.n1 = sc.nextDouble();
		System.out.println("Digite a nota referente ao 2° trimestre: ");
		aluno.n2 = sc.nextDouble();
		System.out.println("Digite a nota referente ao 3° trimestre: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", aluno.finalNote());
		
		if (aluno.finalNote() < 60.0) {
				System.out.println("Failed");
				System.out.printf("Missing %.2f Point%n" , aluno.missingPoints());
		}else {
				System.out.println("Pass");
		}
		sc.close();
	}

}
