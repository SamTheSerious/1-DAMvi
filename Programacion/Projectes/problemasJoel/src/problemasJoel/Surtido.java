package problemasJoel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Surtido {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int i = 0; i < casos; i++) {
			Map<String, Integer> galletas = new HashMap<String, Integer>();
			int lineas = consola.nextInt();
			consola.nextLine();
			
			for(int j = 0; j < lineas; j++) {
				String galleta = consola.nextLine();
				
				if(!galletas.containsKey(galleta)) {
					galletas.put(galleta, 1);
				}else {
					galletas.replace(galleta, galletas.get(galleta) + 1);
				}
			}
			
			int valor = 1000;
			
			for(String s : galletas.keySet()) {
				if(galletas.get(s) < valor) {
					valor = galletas.get(s);
				}
			}
			System.out.println(valor);
		}
		
		consola.close();
	}

}
