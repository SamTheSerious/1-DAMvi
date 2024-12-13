package simulacroExamenIfs;
import java.util.*;

public class PorblemaUno{
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int a = consola.nextInt();
		int b = consola.nextInt();
		int c = consola.nextInt();
		
		if((a == b && b == c) || (a == 0 && b == c) || (b == 0 && a == c) || (c == 0 && a == b) ) {
			System.out.println("TRIO");
		}else if((a == b) || (b == c) || (a == c) || (a == 0 || b == 0 || c == 0)) {
			System.out.println("PARELLA");
		}else {
			System.out.println("RES");
		}
		
		consola.close();
	}
}

