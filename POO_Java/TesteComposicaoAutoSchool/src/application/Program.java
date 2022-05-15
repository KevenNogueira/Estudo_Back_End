package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.AutoSchool;
import entities.Car;
import entities.Instructor;
import entities.Pupil;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter data Auto School -> ");
		System.out.print("Name: ");
		String nameSchool = sc.nextLine();
		System.out.print("Which category B value is corresponding to the car ? ");
		Double value = sc.nextDouble();

		AutoSchool school1 = new AutoSchool(nameSchool, value);

		System.out.print("How many instructors work in the auto School " + nameSchool + " ? ");
		int ins = sc.nextInt();
		System.out.print("How many pupils to in the auto school " + nameSchool + " ? ");
		int pup = sc.nextInt();
		System.out.println(
				"==========//==========//==========//==========//==========//==========//==========//==========");

		sc.nextLine();
		for (int n = 1; n <= ins; n++) {
			System.out.println();
			System.out.println("Enter # " + n + " instructor data ->");
			System.out.print("What's the name ? ");
			String nameInstructor = sc.nextLine();
			System.out.print("What's your date of birth, sir " + nameInstructor + " ? (DD/MM/YYYY) ");
			Date birthDateInstructor = sdf.parse(sc.next());
			System.out.print("What's your Social Security Number sir " + nameInstructor + " ? ");
			Integer numberCpf = sc.nextInt();

			System.out.println("------------");

			sc.nextLine();
			System.out.println("Enter the data of the car belonging to you " + nameInstructor + " ->");
			System.out.print("What model of your car ? ");
			String modelCar = sc.nextLine();
			System.out.print("What's the license plate of your car ? ");
			String plateCar = sc.nextLine();
			System.out.print("What's the mark of your car ? ");
			String markCar = sc.nextLine();
			System.out.print("What is the year of manufacture ? ");
			String manufacture = sc.nextLine();

			Car car = new Car(modelCar, plateCar, markCar, manufacture);
			Instructor instructor = new Instructor(nameInstructor, numberCpf, birthDateInstructor, car);

			school1.addInstructor(instructor);
		}
		System.out.println(
				"==========//==========//==========//==========//==========//==========//==========//==========");
		for (int i = 1; i <= pup; i++) {
			System.out.println();
			System.out.println("Enter # " + i + " pupil data ->");
			System.out.print("What's the name ? ");
			String namePupil = sc.nextLine();
			System.out.print("What's your date of birth, sir " + namePupil + " ? (DD/MM/YYYY) " );
			Date birthDatePupil = sdf.parse(sc.next());
			System.out.print("What's your Social Security Number sir " + namePupil + " ? ");
			Integer numberCpf = sc.nextInt();
			sc.nextLine();
			Pupil pupil = new Pupil(namePupil, numberCpf, birthDatePupil);

			school1.addPupil(pupil);
		}
		System.out.println();
		System.out.println(school1);
		sc.close();

	}

}
