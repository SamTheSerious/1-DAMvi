package examenPruebaArrays;

import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class MaximMinim {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		List<Integer> listaNumsUno = new ArrayList<>();
		List<Integer> listaNumsDos = new ArrayList<>();
		
		Random nums = new Random();
		
		for(int i = 0; i < 10; i++) {
			listaNumsUno.add(nums.nextInt(20) + 1);
			listaNumsDos.add(nums.nextInt(20) + 1);
		}
		System.out.println("Llista 1:" + listaNumsUno);
		System.out.println("Llista 2:" + listaNumsDos);
		
		listaNumsUno.retainAll(listaNumsDos);
		Set<Integer> numerosComunes = new HashSet<>(listaNumsUno);
	
		List<Integer>listaNumsComunes = new ArrayList<>(numerosComunes);
		System.out.println("Numeros Comunes: " + listaNumsComunes);
		
		int max = listaNumsComunes.indexOf(Collections.max(listaNumsComunes));
		int min = listaNumsComunes.indexOf(Collections.min(listaNumsComunes));

		int tempIndex = listaNumsComunes.get(max);
		
		listaNumsComunes.set(max, listaNumsComunes.get(min));
		listaNumsComunes.set(min, tempIndex);
		System.out.println("Lista invertida: " + listaNumsComunes);
		
	}

}
