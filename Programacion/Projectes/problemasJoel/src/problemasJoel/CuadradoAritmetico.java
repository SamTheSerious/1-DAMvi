package problemasJoel;

import java.util.Scanner;

public class CuadradoAritmetico {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);


        int[][] tabla = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = consola.nextInt();
            }
        }
        consola.close();

        if (esCuadradoAritmetico(tabla)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }

    private static boolean esCuadradoAritmetico(int[][] tabla) {
        for (int i = 0; i < 3; i++) {
            if (!esSecuenciaAritmetica(tabla[i][0], tabla[i][1], tabla[i][2])) {
                return false;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (!esSecuenciaAritmetica(tabla[0][j], tabla[1][j], tabla[2][j])) {
                return false;
            }
        }

        return true;
    }

    private static boolean esSecuenciaAritmetica(int a, int b, int c) {
        return (b - a) == (c - b);
    }
}

