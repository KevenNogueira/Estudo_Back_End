import java.util.Scanner;

public class URI_1114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Digite á senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha incoreta!");
			System.out.println("Digite novamente a senha: ");
			senha = sc.nextInt();
		}
		if(senha == 2002) {
			System.out.println("Acesso permitido!");
		}
		sc.close();
		
	}

}
