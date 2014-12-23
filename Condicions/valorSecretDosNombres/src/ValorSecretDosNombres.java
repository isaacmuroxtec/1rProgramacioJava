import java.util.Scanner;


public class ValorSecretDosNombres { 
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre a endevinar:");
		
		int aleatori = (int) (Math.random() * 5 + 1);
		int aleatori2 = (int) (Math.random() * 5 + 1);
		
		int intent = lector.nextInt();
		
		if (intent == aleatori || intent == aleatori2){
			System.out.println("Has encertat");
		} else {
			System.out.println("Tornar-ho a intentar!");
		}
		lector.close();
	}

}
