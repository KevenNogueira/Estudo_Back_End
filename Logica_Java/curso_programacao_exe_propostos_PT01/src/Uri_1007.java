import java.util.Scanner;

public class Uri_1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int A = sc.nextInt();
		
		System.out.println("O segundo valor inteiro");
		int B = sc.nextInt();
		
		System.out.println("O terceiro valor inteiro");
		int C = sc.nextInt();
		
		System.out.println("O quarto valor inteiro");
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("A diferenca entre os valor digitados é: " + diferenca);
		
		
		sc.close();
// 5		6		7		8		-26
	}

}
