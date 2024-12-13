package examenForsDAMvi;
import java.util.Scanner;

public class Cesar {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		String palabra = "";
		String palabraIntro = "";
		boolean sortir = false;
		int cont = 0;
		
		
		while(!sortir) {
			
			System.out.println("1- Introdueix una frase o paraula");
			System.out.println("2- Concatena Paraules");
			System.out.println("3- Buida la cadena");
			System.out.println("4- Saber canvis necesaris");
			System.out.println("5- Sortir");
			
			int opcio = consola.nextInt();
			consola.nextLine();
			
			switch(opcio) {
			
			case 1:
				System.out.println("Introduce una palabra o frase en MAYUSCULAS");
				palabraIntro = palabra = consola.nextLine().toUpperCase();
				break;
			case 2:
				System.out.println("Concatena paraules");
				palabra = consola.next().toUpperCase();
				palabraIntro += palabra;
				System.out.println(palabraIntro);
				break;
			case 3:
				System.out.println("Palabra vaciada");
				palabraIntro = "";
				break;
			case 4:
				if(palabraIntro.isEmpty()) {
					System.out.println("BUIDA");
					break;
				}else {
					for(int i = 0; i < palabraIntro.length(); i++) {
						if(palabraIntro.charAt(i) == 'A' || palabraIntro.charAt(i) == 'E' || palabraIntro.charAt(i) == 'C' || palabraIntro.charAt(i) == 'P') {
							cont++;
						}
					}
				}
				System.out.println("Canvis de lletres: " + cont);
				sortir = true;
				break;
			case 5:
				sortir = true;
				break;
			default:
				System.out.println("AVE CESAR MORITURI TE SALUTAN");
				break;
			}
		}
		consola.close();
	}

}
