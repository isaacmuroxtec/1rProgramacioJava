import java.util.Scanner;


public class BucleLlegint {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix el nombre de guions:");
		int guions = lector.nextInt();
		
		// Declara una variable de control
		int i = 0;
		
		// condicio de !final
		while (i < guions){
			System.out.print("-");
			
			// Increment de la variable de control
			i = i + 1;
		}
		lector.close();

	}

}
