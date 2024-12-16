package problemasJoel;

import java.util.Scanner;

public class Discoteque {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int rows = consola.nextInt();
			int cols = consola.nextInt();
			int[][] matrix = new int[rows][cols];
			int numCharcos = consola.nextInt();
			int cont = 0;
			
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					matrix[r][c] = consola.nextInt();
				}
			}
			
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					if(matrix[r][c] == 1) {
						cont++;
					}else if(matrix[r][c] == 0 && cont > 0) {
						break;
					}
					
				}
			}
			
			if(cont == numCharcos) {
				System.out.println("OK");
			}else {
				System.out.println("DISCOTHEQUE, DISCOTHEQUE");
			}
		}
		consola.close();
	}
}
