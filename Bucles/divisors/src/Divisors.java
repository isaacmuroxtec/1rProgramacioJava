import java.util.Scanner;


public class Divisors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre");
		int esPrimer = lector.nextInt();
		
		int i = 1;
		while (i <= esPrimer){
			if (esPrimer % i == 0) {
				System.out.println(i);
			}
			
			i =  i + 1;
		}
		

	}

}
