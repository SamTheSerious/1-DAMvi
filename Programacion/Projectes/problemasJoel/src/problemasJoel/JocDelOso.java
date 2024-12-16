package problemasJoel;

import java.util.Scanner;

public class JocDelOso {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int c = 0; c < casos; c++) {
			int tam = consola.nextInt();
			char[][] board = new char[tam][tam];
			int count = 0;
			consola.nextLine();
			for(int j = 0; j < tam; j++) {
				String oso = consola.nextLine();
				board[j] = oso.toCharArray();
			}
			
	        for (int i = 0; i < tam; i++) {
	            for (int j = 0; j <= tam - 3; j++) {
	                if (board[i][j] == 'O' && board[i][j + 1] == 'S' && board[i][j + 2] == 'O') {
	                    count++;
	                }
	            }
	        }

	        for (int i = 0; i <= tam - 3; i++) {
	            for (int j = 0; j < tam; j++) {
	                if (board[i][j] == 'O' && board[i + 1][j] == 'S' && board[i + 2][j] == 'O') {
	                    count++;
	                }
	            }
	        }

	        for (int i = 0; i <= tam - 3; i++) {
	            for (int j = 0; j <= tam - 3; j++) {
	                if (board[i][j] == 'O' && board[i + 1][j + 1] == 'S' && board[i + 2][j + 2] == 'O') {
	                    count++;
	                }
	            }
	        }

	        for (int i = 0; i <= tam - 3; i++) {
	            for (int j = 2; j < tam; j++) {
	                if (board[i][j] == 'O' && board[i + 1][j - 1] == 'S' && board[i + 2][j - 2] == 'O') {
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	        consola.close();
		}
	}
}
