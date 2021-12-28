import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, min, max, soma = 0 ; 
		
		System.out.println("Digite o 1° valor: ");
		x = sc.nextInt();
		System.out.println("Digite o 2° valor: ");
		y = sc.nextInt();
		
		if(x < y ) {
			min = x; 
			max = y;
		}else {
			min = y;
			max = x; 
		}
		
		for( int i = min+1; i<max; i++) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		sc.close();
	}

}
