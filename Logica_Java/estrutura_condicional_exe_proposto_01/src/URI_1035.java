import java.util.Scanner;

public class URI_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d; 
		
		System.out.println("Digite um valor: " );
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		d = sc.nextInt();
		
		if( b > c  && d > a  && c+d > a+b && c > 0 && d > 0 && a % 2 == 0 ) {
			System.out.println("Valores aceitos. ");
		} else {
			System.out.println("Valores não aceitos.  ");
		}
		
		sc.close();

	}

}
