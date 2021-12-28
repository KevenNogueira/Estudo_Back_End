import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, resto, horas, minutos, segundos; 
		
		
		System.out.println("Digite a quantidade de segundos que deseja converter para horas, minutos e segundos: ");
		n = sc.nextInt();
		
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println("Ficou: " + horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
