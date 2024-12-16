package problemasJoel;
import java.util.*;
import java.util.Map.Entry;
public class EstamosTraviesos {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int lines = consola.nextInt();
			consola.nextLine();
			Map<String , String> dicc = new HashMap<String, String>();
			for(int l = 0; l < lines; l++) {
				String line = consola.nextLine();
				dicc.put(line.split("-")[0], line.split("-")[1]);
			}
			
			String[] frase = consola.nextLine().split(" ");
			for(int f = 0; f < frase.length; f++) {
				for(Entry<String, String> entry : dicc.entrySet()) {
					if(entry.getKey().equals(frase[f])) {
						frase[f] = entry.getValue();
					}
				}
			}
			
			for(int f = 0; f < frase.length; f++) {
				System.out.print(frase[f] + " ");
			}
		}
		consola.close();
	}

}
