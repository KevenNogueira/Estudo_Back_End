package curso_progracao_entrada_de_dados;

import java.util.Scanner;

public class Entrada_De_Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x;
		int n1;
		double n2;
		System.out.println("Digite um nome para ser armazenado abaixo: ");
		x = sc.next();
		System.out.println("Você digitou o nome de acesso: " + x);
		
		System.out.println("Digite um numero");
		n1 = sc.nextInt();
		System.out.println("O numero digitado é: " + n1);
		
		System.out.println("Digite um numero");
		n2 = sc.nextDouble();
		System.out.println("O numero deciamal digitado é: " + n2);
	}

}
