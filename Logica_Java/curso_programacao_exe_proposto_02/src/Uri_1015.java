import java.util.Locale;
import java.util.Scanner;

public class Uri_1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x1,x2,y1,y2, distancia;
		
		System.out.println("Digite um valor: ");
		x1 = sc.nextDouble();
		
		System.out.println("Digite um valor: ");
		x2 = sc.nextDouble();
		
		System.out.println("Digite um valor: ");
		y1 = sc.nextDouble();
		
		System.out.println("Digite um valor: ");
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt((Math.pow((x2 - x1),2.0) + Math.pow((y2 - y1),2.0 )));
		
		System.out.printf("A distancias entre os valores em um plano é: %.4f%n", distancia);
		
		sc.close();

	}

}
