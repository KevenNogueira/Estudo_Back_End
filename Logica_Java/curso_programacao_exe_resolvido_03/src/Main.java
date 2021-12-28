import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome1 = sc.next();
		
		System.out.println("Digite um nome:");
		String nome2 = sc.next();
		
		System.out.println("Digite a idade correspondente ao 1 nome: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Digite a idade correspondente ao 2 nome");
		int idade2 = sc.nextInt();
		
		//double media = (double) (idade1 + idade2) / 2;
		double media =  (idade1 + idade2) / 2.0;
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
		
		sc.close();
		
	}

}
