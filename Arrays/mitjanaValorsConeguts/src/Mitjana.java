
public class Mitjana {

	public static void main(String[] args) {
		int[] mitjana = {5,4,6,7,5,3,5,6, 1,2};
		
		double suma = 0;
		for (int i = 0; i < mitjana.length; i++) {
			suma = suma + mitjana[i];
		}
		
		System.out.println(suma / mitjana.length);

	}

}
