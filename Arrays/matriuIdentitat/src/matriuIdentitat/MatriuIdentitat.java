package matriuIdentitat;

import java.util.Scanner;

public class MatriuIdentitat {
	public static void main(String[] args){
		// Demanem un nombre a l'usuari
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix el nombre de files de la matriu identitat");
		int filesColumnes = lector.nextInt();
		
		// Declarem l'array
		int [][] identitat = new int[filesColumnes][filesColumnes];
		
		// Recorregut
	
		for (int i = 0; i < identitat.length; i++) {
			identitat[i][i] = 1;
		}
				
		// Imprimir matriu
		for (int i = 0; i < identitat.length; i++) {
			for (int j = 0; j < identitat[i].length; j++) {
				System.out.print(identitat[i][j]+"," );
			}
			System.out.println();
		}
	}
}
