import java.util.Locale;
import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a,b,c,d, maior;
		
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		
		System.out.println("Digite um outro valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o 3 valor: ");
		c = sc.nextInt();
		
		d  = (a+b+Math.abs(a-b));
		maior = (d+c+Math.abs(d-c));
		
		System.out.println(maior +", e o maior numero");
		
		
		sc.close();

	}

}
