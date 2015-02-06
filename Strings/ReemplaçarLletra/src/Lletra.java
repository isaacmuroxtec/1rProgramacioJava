import java.util.Scanner;


public class Lletra {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix la paraula:");
		String paraula = lector.nextLine();
	
		System.out.println("Introdueix la lletra:");
		String lletra = lector.nextLine();
		
		char[] paraulaArray = paraula.toCharArray();
		
		for (int i = 0; i < paraulaArray.length; i++) {
			if (paraulaArray[i] == lletra.charAt(0)){
				paraulaArray[i] = Character.NON_SPACING_MARK;
			}
		}
		
		for (int i = 0; i < paraulaArray.length; i++) {
			System.out.print(paraulaArray[i]);
		}
		
	}

}
