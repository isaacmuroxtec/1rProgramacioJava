import java.util.Scanner;


public class Divisio {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Introdueix el dividend:");
		int dividend = lector.nextInt();
		
		System.out.println("Introdueix el divisor:");
		int divisor = lector.nextInt();
		
		int i = 0;
		while (divisor <= dividend){
			dividend = dividend - divisor;
			i = i + 1;
		}
		
		System.out.println("El residu es:"+dividend);
		System.out.println("El quocient es:"+i);
		lector.close();
	}
}
