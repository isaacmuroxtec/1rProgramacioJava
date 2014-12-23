import java.util.Scanner;


public class Radi {

	
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Escriu dos nombres que representin una coordenada:");
		System.out.println("Primer nombre:");
		double x = lector.nextDouble();
		
		System.out.println("Segon nombre:");
		double y = lector.nextDouble();
		
		double valorFinal = x*x + y*y;
		
		boolean resultat = (valorFinal <= 1);
		
		System.out.println("La coordenada esta dins del cercle: " + resultat);
		
		lector.close();
	}

}
