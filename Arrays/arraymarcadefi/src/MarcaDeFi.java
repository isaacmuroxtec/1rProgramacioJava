import java.util.Scanner;


public class MarcaDeFi {

	public static void main(String[] args) {
		// Declaració d'array de 15 posicions
		int[] notes = new int[15];
		int nota = 0;
		Scanner lector = new Scanner(System.in);
		
		int i = 0;
		while (i < 15 && nota != -1){
		
			System.out.println("Introdueix un nombre:");
			nota = lector.nextInt();
			notes[i] = nota;
			
			i = i + 1;
		}
		// IMPRIMIR
		int j = 0;
		while (j < 15 && notes[j] != -1){
			System.out.println(notes[j]);
			j = j + 1;
		}
		
		

	}

}
