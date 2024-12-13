package simulacroExamenIfs;

import java.util.Scanner;

public class ProblemaDos {
	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		String frase = consola.nextLine();
		
		switch(frase) {
			case "GANDHI":
			case "DANDY":
			case "DAMM VI":
				System.out.println("DAMvi");
				break;
			case "YA VA":
			case "LLAMA":
				System.out.println("JAVA");
				break;
			case "EL RESULTAT ENS DONA":
				System.out.println("MERCADONA");
				break;
			default:
				System.out.println(frase);
		}
		
		consola.close();

	}

}
