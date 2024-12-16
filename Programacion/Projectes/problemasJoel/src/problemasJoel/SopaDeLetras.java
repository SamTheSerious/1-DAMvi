package problemasJoel;


import java.util.Scanner;

public class SopaDeLetras {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int rows = consola.nextInt();
		int cols = consola.nextInt();
		String [][] matrix = new String [rows][cols];
		consola.nextLine();
		
		//RELLENAMOS MATRIZ
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				matrix[r][c] = consola.next();
			}
		}
		
		int numWords = consola.nextInt();
		consola.nextLine();
		
		for(int i = 0; i < numWords; i++) {
			boolean found = false;
			String words = consola.nextLine();
			StringBuilder word = new StringBuilder();
			
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					word.append(matrix[r][c]);
				}
			}
			if(word.toString().contains(words) || word.reverse().toString().contains(words)) {
				found =  true;;
			}
			
			for(int c = 0; c < cols; c++) {
				for(int r = 0; r < rows; r++) {
					word.append(matrix[r][c]);
				}
			}
			if(word.toString().contains(words) || word.reverse().toString().contains(words)) {
				found = true;
			}
			
			if(found) {
				System.out.println(found);
			}else {
				System.out.println(found);
			}
		}
		
		consola.close();
	}

}
