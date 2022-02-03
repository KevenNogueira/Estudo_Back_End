package funcao_para_string;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma pequena frase de 5 palavras: ");

		String frase = sc.nextLine();

		String[] vect = frase.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		sc.close();
	}

}
