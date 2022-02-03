import java.util.Scanner;

public class Teste_de_Mask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de IP para testar o 6 bit:");
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if( ( n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		
		sc.close();
	}

}
