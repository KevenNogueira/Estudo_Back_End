import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < n; i++ ) {
			soma = soma + altura[i];
			
		}
		double media = soma / n; 
		System.out.printf("Altura media: %.2f%n", media);
		
		int cont = 0;
		for (int i = 0; i < n; i++ ) {
			if(idades[i] < 16) {
				cont++;
			}
		}
		double x = (double) cont * 100.0 / n; 
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		sc.close();

	}

}
