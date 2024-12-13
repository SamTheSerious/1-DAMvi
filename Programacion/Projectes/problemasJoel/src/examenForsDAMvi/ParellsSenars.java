package examenForsDAMvi;

import java.util.Scanner;

public class ParellsSenars {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		boolean sortir = false;
		int par = 0;
		int sen = 0;
		boolean magic = false;
		
		while(!sortir) {
			int num = consola.nextInt();
			
			if(num == -1) {
				sortir = true;
			}else {
				if(num % 2 == 0) {
					par += num;
				}else if(num % 2 != 0) {
					sen += num;
				}
				
				if(num == 73) {
					magic = true;
				}
			}
		}
		
		if(!magic) {
			if(par > sen) {
				System.out.println("PARELLS");
			}else {
				System.out.println("SENARS");
			}
		}else {
			System.out.println("MAGIA");
		}
		consola.close();
	}
}
