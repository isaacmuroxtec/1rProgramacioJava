import java.util.Scanner;


public class Aprovats {

	public static void main(String[] args) {
		// Declara l'array
				double[] notes = {7.6, 4.7, 2.8, 6.4, 8.5, 2.6, 5.7, 6.6, 7.2, 4.1};
				
				// Variable boolean de trobat
				boolean existeix = false;
				
				for (int i = 0; i < notes.length && existeix != true; i++) {
					if (notes[i] < 5){
						existeix = true;
					}	
				}
				
				// IMPRIMIR
				System.out.println("Hi han suspesos?" + existeix);
				
				

	}

}
