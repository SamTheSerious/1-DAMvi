package examenArraysListas;

import java.util.*;

public class LesCadires {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		String jugadors = consola.nextLine();
		List<String> llistaJugadors = new ArrayList<>(Arrays.asList(jugadors.split(" ")));
		int numJugadors = llistaJugadors.size();
		
		while(numJugadors > 1) {
			int rotacions = consola.nextInt();
			
			Collections.rotate(llistaJugadors, rotacions);
			llistaJugadors.remove(numJugadors - 1);
			numJugadors--;
			
		}
		
		System.out.println("Ha guanyat " + llistaJugadors);
		
		consola.close();
	}

}
