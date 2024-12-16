package problemasJoel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sinai {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
				
		int casos = consola.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int votes = consola.nextInt();
			consola.nextLine();
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			for(int j = 0; j < votes; j++) {
				String clave = consola.nextLine();
				if(!map.containsKey(clave)) {
					map.put(clave, 1);
				}else {
					map.replace(clave, map.get(clave) + 1);
				}
			}
			String winner = "";
			int valor = 0;
			
			for(String s : map.keySet()) {
				if(map.get(s) > valor) {
					winner = s;
					valor = map.get(s);
				}
			}
			System.out.println(winner);
			map.clear();
		}
		consola.close();
	}

}
