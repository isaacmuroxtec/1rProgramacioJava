
public class InicialitzacioReves {

	public static void main(String[] args) {
		int [] arrayReves = new int[20];
		
		arrayReves[arrayReves.length - 1] = 0;
		
		for(int i = arrayReves.length - 2; i >= 0; i-- ){
			arrayReves [i] = arrayReves[i + 1] + 2;
		}
		
		// IMPRIMIR
		for(int i = 0; i < arrayReves.length; i++ ){
			System.out.println( arrayReves [i]) ;
		}
		

	}

}
