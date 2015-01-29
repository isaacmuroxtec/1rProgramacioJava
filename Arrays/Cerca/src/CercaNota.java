import java.util.Scanner;


public class CercaNota {

	public static void main(String[] args) {
		// Declara l'array
		double[] notes = {7.6, 4.7, 2.8, 6.4, 4.5, 2.6, 5.7, 6.6, 7.2, 4.1};
		
		// Declara Scanner
		System.out.println("Introdueix un nombre a buscar:");
		Scanner lector = new Scanner (System.in);
		double buscar = lector.nextDouble(); 
		
		// Variable boolean de trobat
		boolean existeix = false;
		int aux = -1;
		
		for (int i = 0; i < notes.length && existeix != true; i++) {
			if (notes[i] == buscar){
				existeix = true;
				aux = i;
			}
		}
		
		
		// IMPRIMIR
		System.out.println("Existeix el nombre?" + existeix);
		System.out.println("la posicio de l'array es: "+ aux);
		
	
		
		
		
		

	}

}
