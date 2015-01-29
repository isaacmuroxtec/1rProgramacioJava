
public class NotaMaxima {

	public static void main(String[] args) {
		// Declaro un array de 10 posicions amb valors coneguts
		double[] notes = {7.6, 4.7, 2.8, 6.4, 9.4, 2.6, 5.7, 6.6, 7.2, 4.1};
		
		double notaMaxima = Double.MIN_VALUE;
		
		// Recurrem l'array
		for (int i = 0; i < notes.length; i++) {
			if (notaMaxima < notes[i]){
				notaMaxima = notes[i];
			}
		} 
		System.out.println(notaMaxima);
	}

}
