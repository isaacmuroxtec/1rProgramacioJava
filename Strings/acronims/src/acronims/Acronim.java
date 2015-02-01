package acronims;

import java.util.Scanner;

public class Acronim {

	public static void main(String[] args) {
		System.out.println("Introdueix la frase:");
		Scanner lector = new Scanner(System.in);
		
		String frase = lector.nextLine();
		
		String[] paraules = frase.split(" ");
		
		for (int i = 0; i < paraules.length; i++) {
			String paraula = paraules[i];
			String majuscula = paraula.toUpperCase();
			
			String[] no = {"DE", "LA", "DEL", "LES", "I", "EL", "ELS", "DELS"};
			
			boolean trobat = false;
			
			for (int j = 0; j < no.length && !trobat; j++) {
				if (majuscula.indexOf(no[i]) != -1){
					trobat = true;
				}
			}
			if (trobat == false){
				System.out.print(majuscula.charAt(0));
			}
			
			
			
			
			
			
			
			
			
		}

	}

}
