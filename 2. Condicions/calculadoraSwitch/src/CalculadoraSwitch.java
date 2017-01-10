import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		// Llegir dos nombres
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introdueix el primer nombre:");
		
		boolean tipusCorrecte = lector.hasNextInt();
		if (tipusCorrecte == true){
			int primerNombre = lector.nextInt();
			
			System.out.println("Introdueix el segon nombre:");
			int segonNombre = lector.nextInt();
			
			System.out.println("Escollir l'opció desitjada:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicació");
			System.out.println("4. Divisió");
			System.out.println("5. Mòdul");
			System.out.println("6. Hipotenusa");
			
			// Llegim l'opció de l'usuari
			int operacio = lector.nextInt();
			
			double resultat = 0;
			boolean error = false;
			
			// Realitzem el càlcul
			switch (operacio){
				case 1:
					resultat = primerNombre + segonNombre;
					break;
				case 2:
					resultat = primerNombre - segonNombre;
					break;
				case 3:
					resultat = primerNombre * segonNombre;
					break;
				case 4:
					resultat = primerNombre / segonNombre;
					break;
				case 5: 
					resultat = primerNombre % segonNombre;
					break;
				case 6: 
					resultat = Math.sqrt(primerNombre*primerNombre + segonNombre*segonNombre);
					break;
				default: 
					error = true;
			}  //SWITCH
			
			// Imprimir el resultat
			if (error == false){
				System.out.println("El resultat es: " + resultat);
			} else {
				System.out.println("Opció no disponible");
			}//IF
		}
		else {
			System.out.println("La dada ha de ser un nombre");
		}//IF
		lector.close();

	}//MAIN

}//CLASS
