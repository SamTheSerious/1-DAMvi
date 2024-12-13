package examenPruebaArrays;

import java.util.*;

public class ParellsSenarsVocalsConsonants {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		String frase = "Bambino esta enfadat amb les Strings";
		StringBuilder nuevaFrase = new StringBuilder();
		List<Character> vocals = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		
		for(int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if(i % 2 != 0) {
				nuevaFrase.append('*');
			}else if(i % 2 != 0 && vocals.contains(letra)){
				nuevaFrase.append("");
			}
		}
		System.out.println(nuevaFrase);
		consola.close();
		
	}
}
