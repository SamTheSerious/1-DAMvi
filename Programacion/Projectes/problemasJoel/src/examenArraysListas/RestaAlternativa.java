package examenArraysListas;
import java.util.*;

public class RestaAlternativa {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		
		int digitos = consola.nextInt();
		List<String> resultado = new ArrayList<>();
		int[] arrayNum1 = new int[digitos];
		int[] arrayNum2 = new int[digitos];
		int comp = 0;
		int num1;
		String nueve ="";
		String numUno = "";
		
		for(int i = 0; i < digitos; i++) {
			arrayNum1[i] = consola.nextInt();
		}
		for(int i = 0; i < digitos; i++) {
			arrayNum2[i] = 9 - consola.nextInt();
		}
		
		for(int i = 0; i < digitos; i++) {
			nueve += Integer.toString(arrayNum2[i]);
			numUno += Integer.toString(arrayNum1[i]);
		}
		
		num1 = Integer.valueOf(numUno);
		comp = Integer.valueOf(nueve);
		int res = num1 + comp + 1;
		String n = String.valueOf(res);

		for(int i = 1; i < n.length(); i++) {
			resultado.add(String.valueOf(n.charAt(i)));
		}
		
		for(String digito : resultado) {
			System.out.print(digito + " ");
		}
		
		
		consola.close();
	}

}
