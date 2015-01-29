import java.util.Scanner;


public class Arrays1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		//Declaració de l'array
		int[] arrayEnters = new int [15];
		int i = 0;
		
		while (i < 15){
			System.out.println("Introdueix un nombre:");
			int a = lector.nextInt();
			arrayEnters[i] = a;
			i = i + 1;
		}
		
		
		
		
		System.out.println(arrayEnters[0]);

	}

}
