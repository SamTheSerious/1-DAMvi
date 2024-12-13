package examenForsDAM;
import java.util.Scanner;

public class Cientifica {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		boolean salir = false;
		System.out.print("Introdueix un numero: ");
		double num = consola.nextFloat();
		while(!salir) {
			
			System.out.println("Quina operacio vols fer?");
			
			System.out.println("1- Arrel quadrada de " + (int)num);
			System.out.println("2- " + (int)num + " al quadrat");
			System.out.println("3- " + (int)num + " al cub");
			System.out.println("4- 2 elevat a " + (int)num);
			System.out.println("5- 1/" + (int)num);
			System.out.println("6- Sortir");
			
			int opcion = consola.nextInt();
			
			switch (opcion){
			case 1:
				System.out.printf("RESULTAT: %.3f", Math.sqrt(num));
				System.out.println();
				salir = true;
				break;
			case 2:
				System.out.printf("RESULTAT: %.3f", Math.pow(num, 2));
				System.out.println();
				salir = true;
				break;
			case 3:
				System.out.printf("RESULTAT: %.3f", Math.pow(num, 3));
				System.out.println();
				salir = true;
				break;
			case 4:
				System.out.printf("RESULTAT: %.3f", Math.pow(2, num));
				System.out.println();
				salir = true;
				break;
			case 5:
				double inv = 1/num;
				System.out.printf("RESULTAT: %.3f", inv);
				System.out.println();
				salir = true;
				break;
			default:
				System.out.println("ERROR: Opcio incorrecta");
				break;
			}
		}
		consola.close();
	}
}
