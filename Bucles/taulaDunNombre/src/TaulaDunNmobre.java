import java.util.Scanner;


public class TaulaDunNmobre {
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre:");
		int taula = lector.nextInt();
		
		// Valor inicial de la i
		int i = 10;
		System.out.println("La taula es:");
		
		while (i >= 0){
			// Feina del bucle
			int resultat = taula * i;
			System.out.println(taula + "x" + i + "=" + resultat);
		
			i =  i - 1;
		}
		lector.close();
	}

}





