import java.util.Scanner;


public class ValorSecretBucle { 
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre a endevinar:");
		
		int aleatori = (int) (Math.random() * 10 + 1);
		boolean hasEncertat = false;
		
		int i = 3;
		while (hasEncertat == false && i > 0){
			System.out.println("Et queden "+ i + " intents");
			
			// CONTROLAR NOMBRE INCORRECTE
			boolean correcte = lector.hasNextInt();
			
			while (correcte == false) {
				System.out.println("Has d'introduir un nombre");
				lector.next();
				correcte = lector.hasNextInt();
			}
			// Aqui el nombre �s correcte
			
			int intent = lector.nextInt();
			
			if (intent >= 1 && intent <= 10){
				hasEncertat = (intent == aleatori);
				
				if (hasEncertat == true){
					System.out.println("Has encertat.");
				} else {
					if (i == 1){
						System.out.println("Game Over");
					} else {
						System.out.println("Tornar-ho a intentar!");
					}
					
				}				
			} else {
				System.out.println("El nombre ha d'estar entre 1 i 10");
			}
			i = i - 1;
		}
		lector.close();
	}

}
