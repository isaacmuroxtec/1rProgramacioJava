import java.util.Scanner;


public class DescompteAmbLimit {

	public static final double DESCOMPTE = 0.08;
	public static final double MAXIM = 80;
	
	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);
		
		System.out.println("Introdueix el preu:");
		// 
		boolean tipusCorrecte = lector.hasNextDouble();
		if (tipusCorrecte == true){
			double preu = lector.nextDouble();
			double porcentatge = preu * DESCOMPTE;
			double preuTotal = 0;
			
			if (preu < 100){
				preuTotal = preu;
			} else if (porcentatge <= MAXIM){
				preuTotal = preu - porcentatge;
			} else if (porcentatge > MAXIM){
				preuTotal = preu - MAXIM;
			}
			
			System.out.println("El preu es:"+ preuTotal);
		} else {
			System.out.println("Preu incorrecte");
		}
		lector.close();
	}

}
