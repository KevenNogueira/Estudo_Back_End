import java.util.Locale;
import java.util.Scanner;

public class Main {
// CALCULO SOBRE RETANGULO
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retangulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura; 
		double perimetro = 2 * (base + altura); 
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + (Math.pow(altura, 2.0)));
		
		System.out.printf("AREA = %.4f%n", area );
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}
