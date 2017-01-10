import java.util.Scanner;


public class ValorSecretControlErrors { 
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre a endevinar:");
		int aleatori = (int) (Math.random() * 10 + 1);
		
		
		boolean correcte = lector.hasNextInt();
		if (correcte == true){
			int intent = lector.nextInt();
			if (intent >= 1 && intent <= 10){
				if (intent == aleatori){
					System.out.println("Has encertat");
				} else {
					System.out.println("Tornar-ho a intentar!");
				}
			}else {
				System.out.println("El nombre ha d'estar entre 1 i 10");
			}
		}else {
			System.out.println("El nombre ha de ser numèric!");
		}
		lector.close();
	}

}
