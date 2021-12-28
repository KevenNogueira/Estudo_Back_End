import java.util.Locale;
import java.util.Scanner;

public class URI_1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, n1, n2, n3;
		a = 0;
		b = 0;
		c = 0;

		System.out.println("Digite 1° valor: ");
		n1 = sc.nextDouble();
		System.out.println("Digite 2° valor: ");
		n2 = sc.nextDouble();
		System.out.println("Digite 3° valor: ");
		n3 = sc.nextDouble();

		if (n1 > n2 && n1 > n3 && n2 > n3) {
			a = n1;
			b = n2;
			c = n3;
		} else if (n2 > n1 && n2 > n3 && n1 > n3) {
			a = n2;
			b = n1;
			c = n3;
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			a = n3;
			b = n1;
			c = n2;
		}else {
			a = n3;
			b = n2;
			c = n1;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();
	}

}
