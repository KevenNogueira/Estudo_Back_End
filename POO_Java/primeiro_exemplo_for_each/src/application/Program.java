package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int cont = 0; cont< vect.length; cont++) {
			System.out.println(vect[cont]);
		}
		
		System.out.println("=============================================================");
		for (String obj : vect) {
			System.out.println(obj);
		}

		// Para cada obejeto OBJ contido no vetor vect faça. Essa e a forma para se ler essa sintaxe. 
	}

}
