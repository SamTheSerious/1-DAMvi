package examenForsDAMvi;
import java.util.*;
public class FestaMajor {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		int rondes = consola.nextInt();
		int aBoomDescCont = 0;
		int aJovesDescCont = 0;
		int bBoomDescCont = 0;
		int bJovesDescCont = 0;
		boolean error = false;
		
		for(int i = 0; i < rondes; i++) {
			int aBoomInt = consola.nextInt();
			int aBoomDesc = consola.nextInt();
			int aJovesInt = consola.nextInt();
			int aJovesDesc = consola.nextInt();
			int bBoomInt = consola.nextInt();
			int bBoomDesc = consola.nextInt();
			int bJovesInt = consola.nextInt();
			int bJovesDesc = consola.nextInt();
			
			if(aBoomInt < aBoomDesc || aJovesInt < aJovesDesc || bBoomInt < bBoomDesc || bJovesInt < bJovesDesc) {
				error = true;
				break;
			}else {
				aBoomDescCont = aBoomDescCont + aBoomInt;
				aJovesDescCont = bJovesDescCont + aJovesDesc;
				bBoomDescCont = bBoomDescCont + bBoomDesc;
				bJovesDescCont = bJovesDescCont + bJovesDesc;
			}
		}
		
		if(!error) {
			if((aBoomDescCont + aJovesDescCont) > (bBoomDescCont + bJovesDescCont)) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
			
			if((aBoomDescCont + bBoomDescCont) > (aJovesDescCont + bJovesDescCont)) {
				System.out.println("BOOMERS");
			}else {
				System.out.println("JOVES");
			}
		}else {
			System.out.println("ERROR");
		}
		consola.close();
	}

}
