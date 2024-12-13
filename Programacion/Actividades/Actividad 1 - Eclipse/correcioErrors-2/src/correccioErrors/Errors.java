package correccioErrors;


public class Errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		String nom;
		
		
		System.out.prin("Hola! \nCom et dius? ");
		nom = reader.next();
		System.out.println("Hola " + nom.toString() + "!")
		
		System.out.print("Quans anys tens? ");
		edat = reader.nextInt();
		
		if (edat >= 18) 
			System.out.println("Ja ets major d''edat");
			System.out.println("Si tens el carnet, ja pots conduir un cotxe");
		}
		else {
			System.out.println("Encara ets petit ");
		}
		
		reader.close();
		
	}

