import java.util.Scanner;

public class Uri_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario, nota, resto, n1;
		
		System.out.println("Digite um valor inteiro de seu salario: ");
		salario = sc.nextInt();
		
		resto = salario;
		
		nota = 100;
		n1 = resto / nota; 
		System.out.println("Você recebe " + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota; 
		
		nota = 50;
		n1 = resto / nota; 
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota;
		
		nota = 20; 
		n1 = resto / nota;
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota;
		
		nota = 10;
		n1 = resto / nota; 
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto%nota;
		
		nota = 5;
		n1 = resto / nota; 
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota; 
		
		nota = 2;
		n1 = resto / nota; 
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota; 
		
		nota = 1; 
		n1 = resto / nota;
		System.out.println("Você recebe "  + n1 + " nota(s) de R$ " + nota);
		resto = resto % nota;
		sc.close();

	}

}
