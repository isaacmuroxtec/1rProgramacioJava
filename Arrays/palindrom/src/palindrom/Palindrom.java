package palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix una paraula:");
		String paraula = lector.nextLine();
		
		char[] paraulaArray = paraula.toCharArray();
		
		boolean palindrom = true;
		int i = 0;
		while(i < paraulaArray.length/2 && palindrom == true){
			if (paraulaArray[i] != paraulaArray[paraulaArray.length -1 - i]){
				palindrom = false;
			}
			i = i + 1;
		}
		System.out.println(palindrom);

	}

}
