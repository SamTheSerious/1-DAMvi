package examenForsDAM;

import java.util.Scanner;

public class Equilater {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int num = consola.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		consola.close();

	}

}
