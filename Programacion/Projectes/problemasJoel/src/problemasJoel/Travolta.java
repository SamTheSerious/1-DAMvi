package problemasJoel;

import java.util.Scanner;

public class Travolta {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int rows = consola.nextInt();
		int cols = consola.nextInt();
		int[][] matrix = new int[rows][cols];
		int numBuscat = consola.nextInt();
		int numTrobat = 0;
		boolean found = false;
		
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				matrix[r][c] = consola.nextInt();
			}
		}
		
		for(int r = 1; r < rows - 1; r++) {
			for(int c = 1; c < cols - 1; c++) {
				if(matrix[r][c - 1] == numBuscat && matrix[r][c + 1] == numBuscat) {
					found = true;
					numTrobat = matrix[r][c];
					break;
				}
			}
		}
		if(found) {
			System.out.println(numTrobat);
		}else {
			System.out.println("NO");
		}
		consola.close();
	}
}
