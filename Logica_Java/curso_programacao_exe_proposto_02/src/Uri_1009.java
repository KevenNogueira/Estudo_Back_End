import java.util.Locale;
import java.util.Scanner;

public class Uri_1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do vendedor");
		String nome = sc.next();
		
		System.out.printf("Qual salário %s recebe: ",nome );
		double salario = sc.nextDouble();
		
		System.out.printf("Qual total de vendas %s fez: ", nome);
		double vendas = sc.nextDouble();
		
		double total = salario + vendas *0.15;
		System.out.printf(" %s recebera um total de: R$ %.2f%n", nome, total);
		sc.close();
		
	}

}
