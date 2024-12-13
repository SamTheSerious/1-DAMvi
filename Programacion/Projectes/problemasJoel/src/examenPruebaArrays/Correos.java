package examenPruebaArrays;
import java.util.*;

public class Correos {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int casos = consola.nextInt();
		consola.nextLine();
		String[] nombres = new String[casos];
		String[] apellidos = new String[casos];
		String[] anyos = new String[casos];
		List<String> correos = new ArrayList<String>();
		String direccionEmail = "@ies-sabadell.cat";
		
		for(int i = 0; i < casos; i++) {
			nombres[i] = String.valueOf(consola.nextLine().toLowerCase().toCharArray()[0]);
		}
		for(int i = 0; i < casos; i++) {
			apellidos[i] = consola.nextLine().toLowerCase();
		}
		for(int i = 0; i < casos; i++) {
			correos.add(nombres[i] + apellidos[i] + direccionEmail);
		}
		
		for(int i = 0; i < casos; i++) {
			char[] anyo = consola.nextLine().toCharArray();
			anyos[i] = "";
			anyos[i] += String.valueOf(anyo[2]) + String.valueOf(anyo[3]);
		}
		int indice = -1;
		
        for (int i = 0; i < correos.size(); i++) {
            for (int j = i + 1; j < correos.size(); j++) {
                if (correos.get(i).equals(correos.get(j))) {
                    if (j > indice) {
                        indice = j;
                        String nombreApellido = correos.get(j).split("@")[0];
                        nombreApellido += anyos[j] + "@" + correos.get(j).split("@")[1];
                        correos.remove(j);
                        correos.add(j, nombreApellido);
                    }
                }
            }
        }
        String correoUltimo = correos.get(correos.size() - 1);
        correos.remove(correos.get(correos.size() - 1));
        correos.sort(null);
        correos.add(0, correoUltimo);
		System.out.println(correos);
	}
}
