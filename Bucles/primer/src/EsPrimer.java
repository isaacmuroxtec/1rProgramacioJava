import java.util.Scanner;


public class EsPrimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre");
		int esPrimer = lector.nextInt();
		
		boolean resultat = true;
				
		int i = 2;
		while (i < esPrimer && resultat == true){
			if (esPrimer % i == 0) {
				resultat = false;
			}
			
			i =  i + 1;
		}
		
		System.out.println("Es primer?"+ resultat);

	}

}
