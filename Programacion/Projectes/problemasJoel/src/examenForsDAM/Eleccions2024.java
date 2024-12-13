package examenForsDAM;

import java.util.Scanner;

public class Eleccions2024 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int farris = 0;
		int drump = 0;
		
		while(farris < 4 && drump < 6) {
			String presi = consola.nextLine();
			
			if(presi.equalsIgnoreCase("farris")) {
				farris++;
			}else if(presi.equalsIgnoreCase("drump")) {
				drump++;
			}
		}
		if(farris == 4) {
			System.out.println("Ha guanyat FARRIS");
		}else if(drump == 6) {
			System.out.println("Ha guanyat DRUMP");
		}
		consola.close();

	}

}
