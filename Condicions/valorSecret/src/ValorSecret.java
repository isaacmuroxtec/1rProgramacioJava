import java.util.Scanner;


public class ValorSecret {
	
	public static final int VALORSECRET =5; 
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre a veure si l'adivines:");
		
		int intent = lector.nextInt();
		
		if (intent == VALORSECRET){
			System.out.println("Felicitats!!!");
		} else {
			System.out.println("Has fallat! Torna-ho a intentar!");
		}
		lector.close();
	}

}
