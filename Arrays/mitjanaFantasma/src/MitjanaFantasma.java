
public class MitjanaFantasma {

	public static void main(String[] args) {
		double[] notes = {7.6, 4.7, 2.8, 6.4, -1, 2.6, 5.7, 6.6, 7.2, 4.1};
		
		double mitjana = 0;
		
		int i = 0;
		while(i < notes.length && notes[i] != -1  ){
			mitjana = mitjana + notes[i];
			i = i + 1;
		}
		System.out.println("La Mitjana es: " + mitjana / i);

	}

}
