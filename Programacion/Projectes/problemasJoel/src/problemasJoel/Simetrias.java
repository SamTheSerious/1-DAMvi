package problemasJoel;

import java.util.Scanner;

public class Simetrias {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int rows = consola.nextInt();
			int cols = consola.nextInt();
			consola.nextLine();
			String[][] matrix = new String[rows][cols];

			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					matrix[r][c] = consola.next();
				}
			}
			
			boolean simV = true;
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols / 2; c++ ) {
					if(!matrix[r][c].equals(matrix[r][cols - 1 - c])) {
						simV = false;
						break;
					}
				}
				if(!simV) {
					break;
				}
			}
			boolean simH = true;
			for(int r = 0; r < rows / 2; r++) {
				for(int c = 0; c < cols; c++ ) {
					if(!matrix[r][c].equals(matrix[rows - 1 - r][c])) {
						simH = false;
						break;
					}
				}
				if(!simH) {
					break;
				}
			}
			
			if(simV && simH) {
				System.out.println("DOBLE");
			}else if(simV && !simH) {
				System.out.println("VERTICAL");
			}else if(!simV && simH) {
				System.out.println("HORITZONTAL");
			}else {
				System.out.println("CAP");
			}
		}
		consola.close();
	}
}
