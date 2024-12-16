package problemasJoel;

import java.util.*;



public class ClicksTo {
	
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int c = 0; c < casos; c++) {
			int lines = consola.nextInt();
			consola.nextLine();
			Map<String, List<String>> links = new HashMap<String, List<String>>();
			Queue<String> cola = new LinkedList<>();
			Set<String> clavesVisitadas = new HashSet<>();
			
			for(int l = 0; l < lines; l++) {
				String entrada = consola.nextLine();
				String clave = entrada.split("->")[0];
				String valor = entrada.split("->")[1];
				
				if(!links.containsKey(clave)) {
					List<String> valores = new ArrayList<>();
					valores.add(valor);
					links.put(clave, valores);
				}else {
					links.get(clave).add(valor);
				}
			}
			
			String inicio = consola.nextLine();
			cola.add(inicio);
			clavesVisitadas.add(inicio);
			int clicks = 0;
			
			while(!cola.isEmpty()) {
				int tam = cola.size();
				
				for(int i = 0; i < tam; i++) {
					
					String claveActual = cola.poll();
					if(claveActual.equals("HITLER")) {
						System.out.print(clicks);
					}else if(!links.containsKey(claveActual)) {
						System.out.print("IMPOSSIBLE");
					}
					
					List<String> candidatos = links.getOrDefault(claveActual, new ArrayList<String>());

					for(String candidato : candidatos) {
						if(!clavesVisitadas.contains(candidato)) {
							clavesVisitadas.add(candidato);
							cola.add(candidato);
						}
					}
				}
				clicks++;
			}
		}
		consola.close();
	}
}




