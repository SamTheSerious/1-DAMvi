package examenForsDAMvi;
import java.util.Scanner;

public class TieBreak {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int puntsDjo = 6;
		int puntsAlc = 7;
		
		while((puntsDjo < 10 && puntsAlc < 10) || (Math.abs(puntsDjo - puntsAlc) < 2)) {
			String jugador = consola.next();
			
			if(jugador.equalsIgnoreCase("DJOKOVIC")) {
				puntsDjo++;
			}else {
				puntsAlc++;
			}
		}
		
		if(puntsDjo > puntsAlc) {
			System.out.println("GUANYA DJOKOVIC");
		}else {
			System.out.println("GUANYA ALCARAZ");
		}
		
		consola.close();

	}

}
