import java.util.Scanner;

public class Uri_1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de numero inteiro: ");
		int A = sc.nextInt();
		
		System.out.println("Digite o segunda valor inteiro que ser� multiplicado pelo primeiro");
		int B = sc.nextInt();
		
		int produto = A * B; 
		
		System.out.println("O produto dos valores �: " + produto);
		sc.close();
	}

}
