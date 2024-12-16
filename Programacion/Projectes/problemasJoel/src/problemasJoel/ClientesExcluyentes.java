package problemasJoel;

import java.util.*;
public class ClientesExcluyentes {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		char[][] sala = new char[5][5];

		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				sala[i][j] = consola.next().charAt(0);
			}
		}
		
        if (cumpleNormas(sala)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        consola.close();
	}
	
	public static boolean cumpleNormas(char[][] sala) {
		int [] x = {0, 1, 0, -1};
		int [] y = {1, 0, -1, 0};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char persona = sala[i][j];
				
				for(int xy = 0; xy < x.length; xy++) {
					int coorX = i + x[xy];
					int coorY = j + y[xy];
					
					if(coorX >= 0 && coorX < 5 && coorY >= 0 && coorY < 5) {
						char vecino = sala[coorX][coorY];
						if (persona == 'A' && vecino == 'B') return false;
                        if (persona == 'B' && vecino == 'A') return false;
                        if (persona == 'C' && vecino == 'D') return false;
                        if (persona == 'D' && vecino == 'C') return false;
					}
				}
			}
		}
		
		return true;
	}

}
