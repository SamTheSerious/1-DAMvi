package examenArraysListas;

import java.util.*;

public class ElGrosVirtual {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		Random randomNum = new Random();
		
		String num = consola.nextLine();
		List<String> cupon = new ArrayList<>(Arrays.asList(num.split(",")));
		List<Integer> numGanador = new ArrayList<>();
		List<String> encertats = new ArrayList<>();
		
		int cont = 1;
		for(int i = 0; i < 5; i++) {
			numGanador.add(randomNum.nextInt(10));
		}

		for(int i = 0; i < 5; i++) {
			if(!cupon.get(i).equals(numGanador.get(i).toString())) {
				encertats.add(cupon.get(i));
			}else {
				encertats.add("*");
			}
		}
		
		for(int i = encertats.size()-1; i > 0; i-- ) {
			if(i > 0) {
				if(encertats.get(i).equals("*") && encertats.get(i - 1).equals("*")) {
					cont++;
				}
			}
		}
		
		if(cont == 5) {
			System.out.print("Nombre Guanyador: ");
			for(Integer n : numGanador) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("El meu nombre amb els encerts: ");
			for(String n : encertats) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("Increible! Has guanyat el GROS");
		}else if(cont > 1 && cont < 5) {
			System.out.print("Nombre Guanyador: ");
			for(Integer n : numGanador) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("El meu nombre amb els encerts: ");
			for(String n : encertats) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("Enhorabona! Has encertat " + cont + " nombres!");
		}else {
			System.out.print("Nombre Guanyador: ");
			for(Integer n : numGanador) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.print("El meu nombre amb els encerts: ");
			for(String n : encertats) {
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("Ho sento, mes sort a la propera!");
		}
		consola.close();
	}

}
