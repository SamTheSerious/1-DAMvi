package examenForsDAM;

import java.util.Scanner;

public class CoolNumbers {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		for(int i = 100; i < 1000; i++) {
			int cent = (int) (i * 0.01);
			int dec = (int) ((i - cent * 100) * 0.1);
			int uni = (int) (i - (cent * 100 + dec * 10));
			boolean coolnum = (Math.pow(cent, 3) + Math.pow(dec, 3) + Math.pow(uni, 3) == i);
			
			if(coolnum) {
				System.out.println(i + " es un Cool Number");
			}
		}
		consola.close();
	}

}
