import java.util.Scanner;

public class URI_1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b; 
		
		System.out.println("Digite um valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0 ) {
			System.out.println("S�o multiplos.");
		} else {
			System.out.println("N�o s�o multiplos.");
		}
		sc.close();

	}

}
