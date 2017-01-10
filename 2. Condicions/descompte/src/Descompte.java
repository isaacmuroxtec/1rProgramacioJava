import java.util.Scanner;


public class Descompte {
	
	public static final double DESCOMPTE = 0.08;
	
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Introdueix el preu:");
		double preu = lector.nextDouble();
		
		if (preu >= 100){
			preu = preu - preu * DESCOMPTE;
		}
		System.out.println("El seu pre és:"+ preu);
		lector.close();
	}
}
