
public class InicialitzacioArrays {

	public static void main(String[] args) {
		int[] array = new int[20];
		
		array[0] = 1;
		
		for (int i = 1; i < array.length; i ++){
			array[i] = array[i - 1] * 2;
		}
		
		// IMPRIMIR
		for (int i = 0; i < array.length; i ++){
			System.out.println(array[i]);
		}

	}

}
