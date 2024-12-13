package simulacroExamenIfs;

import java.util.Scanner;

public class ProblemaCuatro {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		int hp = consola.nextInt();
		int max_hp = consola.nextInt();
		int status = consola.nextInt();
		
		if(hp >= 0) {
			if(hp > 0) {
				if(hp < max_hp) {
					if(status == 0) {
						System.out.print("CURAR");
					}else {
						System.out.print("CURAR I ESTAT");
					}
				}else {
					if(hp == max_hp) {
						if(status != 0) {
							System.out.print("ESTAT");
						}else {
							System.out.print("RES");
						}
					}
				}
			}else {
				System.out.println("DEBILITAT");
			}
		}
		
		consola.close();

	}

}
