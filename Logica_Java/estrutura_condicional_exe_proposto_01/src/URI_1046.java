import java.util.Scanner;

public class URI_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, total; 
		
		System.out.println("Digite a hora inicial do jogo:");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo:");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			total = horaInicial - horaFinal;
		}else {
			total = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou um total de " +total + " horas");
		sc.close();

	}

}
