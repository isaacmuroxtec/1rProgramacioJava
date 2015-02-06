
public class DesplaçamentArray {
	public static void main(String[] args) {
		int[] array = {4,6,3,5,4,5,6,2,8,1};
		
		// ALGORISME
		int i = array.length -1;
		int aux = 0;
		while(i > 0){
			
			aux = array[i-1];
			array[i-1] = array[i];
			array[i] = aux;
			i = i - 1;
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

}
