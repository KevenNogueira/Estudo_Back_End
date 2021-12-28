import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n, produto;
		
		System.out.println("Digite um valor: ");
		n = sc.nextInt();
		
		for( int i=1; i<= 10; i ++) {
			produto = i * n;
		System.out.println( i + " x " + n + " = " + produto);
		}
		
		sc.close();
		
	}

}
