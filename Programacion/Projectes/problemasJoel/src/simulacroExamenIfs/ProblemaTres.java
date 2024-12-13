package simulacroExamenIfs;

import java.util.Scanner;

public class ProblemaTres {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		
		int min = consola.nextInt();
		
		
		if(min % 1440 < 22 * 60 || min % 1440 > 23 * 60 + 59) {
			System.out.println("OK");
		}else {
			System.out.println("RAID");
		}
		
		consola.close();

	}

}
