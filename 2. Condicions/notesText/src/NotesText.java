import java.util.Scanner;

public class NotesText {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Introdueix la nota a convertir:");
		
		double valorIntroduit = lector.nextDouble();
		
		if (valorIntroduit < 0 || valorIntroduit > 10){
			System.out.println("La nota ha d'estar entre 0 i 10");
		} else { 
			if (valorIntroduit < 5){
				System.out.println("Suspes");
			} else if (valorIntroduit >= 5 && valorIntroduit < 6){
				System.out.println("Suficient");
			} else if (valorIntroduit >= 6 && valorIntroduit < 7){
				System.out.println("Bé");
			} else if (valorIntroduit >= 7 && valorIntroduit < 9){
				System.out.println("Notable");
			} else if (valorIntroduit >= 9 && valorIntroduit <= 10){
				System.out.println("Excel·lent");
			}  
		}
		lector.close();
	}
}
