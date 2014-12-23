import java.util.Scanner;


public class Multiples3 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix el limit dels multiples");
		
		int limit = lector.nextInt();
		int i = 0;
		
		while (i < limit){
			// Feina del bucle
			System.out.print(i + ",");	
			i = i + 3;
		}
		lector.close();
	}

}
